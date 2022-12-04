package hu.aestallon.giannitsa.domain.repository;

import hu.aestallon.giannitsa.domain.model.Illustration;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IllustrationRepository extends CrudRepository<Illustration, Long> {

    Optional<Illustration> findByName(String name);
}
