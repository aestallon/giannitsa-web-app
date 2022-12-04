package hu.aestallon.giannitsa.domain.api;

import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;

import java.util.List;

public interface HomilyService {

  void deleteHomily(Long homilyId);

  List<Homily> getAllHomilies();

  Illustration getCoverIllustrationByHomilyId(Long id);
}
