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

import java.util.List;
import java.util.Optional;

public class HomilyApiDelegateImpl implements HomilyApiDelegate {

  @Autowired
  HomilyService homilyService;

  @Override
  public ResponseEntity<List<HomilyDto>> getAllHomilies() {
    List<Homily> domainHomilies =
        homilyService.getAllHomilies();
    List<HomilyDto> homilies = domainHomilies.stream()
        .map(dh -> new HomilyDto()
            .id(dh.getId())
            .date(dh.getSpokenAt())
            .paragraphs(dh.getParagraphs())
            .title(dh.getTitle())
        ).toList();
    return ResponseEntity.ok(homilies);
  }

  @Override
  public ResponseEntity<Resource> getHomilyCoverIllustration(Long homilyId) {
    Illustration ill = homilyService.getCoverIllustrationByHomilyId(homilyId);
    Resource response = null;
    if (ill != null) {
      byte[] imagebytes = ill.getImagebytes();
      response = new ByteArrayResource(imagebytes);
    }
    return ResponseEntity.of(Optional.ofNullable(response));
  }
}
