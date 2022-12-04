package hu.aestallon.giannitsa.domain.api;

import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;
import hu.aestallon.giannitsa.domain.repository.HomilyRepository;
import hu.aestallon.giannitsa.domain.repository.IllustrationRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

public class HomilyServiceImpl implements HomilyService {

  private final HomilyRepository       homilyRepository;
  private final IllustrationRepository illustrationRepository;

  public HomilyServiceImpl(HomilyRepository homilyRepository,
                           IllustrationRepository illustrationRepository) {
    this.homilyRepository = homilyRepository;
    this.illustrationRepository = illustrationRepository;
  }

  @Override
  public void deleteHomily(Long homilyId) {
    throw new IllegalStateException("Not implemented");
  }

  @Override
  public List<Homily> getAllHomilies() {
    return StreamSupport.stream(homilyRepository.findAll().spliterator(), false).toList();
  }

  @Override
  public Illustration getCoverIllustrationByHomilyId(Long id) {
    Optional<Homily> homily = homilyRepository.findById(id);
    if (homily.isEmpty() || homily.get().getCoverIllustration().getId() == null) {
      return null;
    }
    Optional<Illustration> illustration =
        illustrationRepository.findById(homily.get().getCoverIllustration().getId());
    return illustration.orElse(null);
  }
}
