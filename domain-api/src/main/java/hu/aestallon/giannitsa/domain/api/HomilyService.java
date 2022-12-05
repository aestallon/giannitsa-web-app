package hu.aestallon.giannitsa.domain.api;

import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;

import java.util.List;
import java.util.Optional;

public interface HomilyService {

  List<Homily> getAllHomilies();

  Optional<Homily> getHomilyById(Long id);

  Long saveHomily(Homily homily);

  Homily updateHomily(Homily homily);

  void deleteHomilyById(Long homilyId);

  Optional<Illustration> getCoverIllustrationFor(Homily homily);

  void setCoverIllustrationFor(Homily homily, Illustration illustration);

  void deleteCoverIllustrationFor(Homily homily);


}
