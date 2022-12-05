package hu.aestallon.giannitsa.domain.api;

import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;
import hu.aestallon.giannitsa.domain.repository.HomilyRepository;
import hu.aestallon.giannitsa.domain.repository.IllustrationRepository;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HomilyServiceImpl implements HomilyService {

  private final HomilyRepository       homilyRepository;
  private final IllustrationRepository illustrationRepository;

  public HomilyServiceImpl(HomilyRepository homilyRepository,
                           IllustrationRepository illustrationRepository) {
    this.homilyRepository = homilyRepository;
    this.illustrationRepository = illustrationRepository;
  }

  @Override
  public List<Homily> getAllHomilies() {
    final List<Homily> result = new ArrayList<>();
    homilyRepository.findAll().forEach(result::add);
    return result;
  }

  @Override
  public Optional<Homily> getHomilyById(Long id) {
    return homilyRepository.findById(id);
  }

  @Override
  public Long saveHomily(Homily homily) {
    return homilyRepository.save(homily).getId();
  }

  @Override
  public Homily updateHomily(Homily homily) {
    if (homily.getId() == null) {
      throw new IllegalArgumentException("Homily ID cannot be null for update!");
    }
    return homilyRepository.save(homily);
  }

  @Override
  public void deleteHomilyById(Long homilyId) {
    homilyRepository.deleteById(homilyId);
  }

  @Override
  public Optional<Illustration> getCoverIllustrationFor(Homily homily) {
    Long illustrationId = homily.getCoverIllustration().getId();
    if (illustrationId == null) {
      return Optional.empty();
    }
    return illustrationRepository.findById(illustrationId);
  }

  @Override
  public void setCoverIllustrationFor(Homily homily, Illustration illustration) {
    Long illustrationId = illustration.getId();
    if (illustrationId == null) {
      illustrationId = illustrationRepository
          .save(illustration)
          .getId();
    }
    homily.setCoverIllustration(AggregateReference.to(illustrationId));
    homilyRepository.save(homily);
  }

  @Override
  public void deleteCoverIllustrationFor(Homily homily) {
    if (homily.getCoverIllustration() != null) {
      homily.setCoverIllustration(null);
      homilyRepository.save(homily);
    }
  }
}
