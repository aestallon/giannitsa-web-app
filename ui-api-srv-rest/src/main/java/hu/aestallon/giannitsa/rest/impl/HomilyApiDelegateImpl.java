package hu.aestallon.giannitsa.rest.impl;

import hu.aestallon.giannitsa.domain.api.HomilyService;
import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;
import hu.aestallon.giannitsa.rest.api.HomilyApiDelegate;
import hu.aestallon.giannitsa.rest.model.HomilyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class HomilyApiDelegateImpl implements HomilyApiDelegate {

  private static final Function<Homily, HomilyDto> fromDomainToDto = homily ->
      new HomilyDto()
          .id(homily.getId())
          .title(homily.getTitle())
          .speaker(homily.getSpeaker())
          .date(homily.getSpokenAt())
          .paragraphs(homily.getParagraphs());

  private static final Function<HomilyDto, Homily> fromDtoToDomain = dto ->
      Homily.builder()
          .id(dto.getId())
          .title(dto.getTitle())
          .speaker(dto.getSpeaker())
          .spokenAt(dto.getDate())
          .paragraphs(dto.getParagraphs())
          .build();

  @Autowired
  HomilyService homilyService;

  @Override
  public ResponseEntity<List<HomilyDto>> getAllHomilies() {
    List<Homily> homilies =
        homilyService.getAllHomilies();
    List<HomilyDto> homilyDtos = homilies.stream()
        .map(fromDomainToDto)
        .toList();
    return ResponseEntity.ok(homilyDtos);
  }

  @Override
  public ResponseEntity<Resource> getHomilyCoverIllustration(Long homilyId) {
    Optional<Resource> resource = homilyService.getHomilyById(homilyId)
        .flatMap(homilyService::getCoverIllustrationFor)
        .map(Illustration::getImagebytes) // TODO: Introduce Pair here
        .map(ByteArrayResource::new);
    return ResponseEntity.of(resource);
  }

  @Override
  public ResponseEntity<Void> deleteHomily(Long homilyId) {
    homilyService.deleteHomilyById(homilyId);
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<Void> deleteHomilyCoverIllustration(Long homilyId) {
    homilyService.getHomilyById(homilyId)
        .ifPresent(homilyService::deleteCoverIllustrationFor);
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<HomilyDto> getHomily(Long homilyId) {
    return ResponseEntity.of(homilyService
        .getHomilyById(homilyId)
        .map(fromDomainToDto));
  }

  @Override
  public ResponseEntity<Void> postHomily(HomilyDto homily, MultipartFile content) {
    // TODO: format is not appropriate, dto cannot be parsed.
    homilyService.saveHomily(fromDtoToDomain.apply(homily));
    // TODO: Handle Word file upload containing text to parse as paragraphs.
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<Void> setHomilyCoverIllustration(Long homilyId, MultipartFile image) {
    Optional<Homily> homily = homilyService.getHomilyById(homilyId);
    if (homily.isEmpty()) {
      throw new IllegalArgumentException("homilyId " + homilyId + " is invalid.");
    }

    try {
      final byte[] imageBytes = image.getBytes();
      final String name = image.getName();
      final Illustration illustration = new Illustration(name, imageBytes);
      homilyService.setCoverIllustrationFor(homily.get(), illustration);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<HomilyDto> updateHomily(Long homilyId, HomilyDto homilyDto) {
    // TODO: handle if IDs don't match, the path parameter is missing, etc.
    Homily prepared = fromDtoToDomain.apply(homilyDto);
    prepared.setId(homilyId);
    Homily updated = homilyService.updateHomily(prepared);
    return ResponseEntity.ok(fromDomainToDto.apply(updated));
  }
}
