package hu.aestallon.giannitsa.domain.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceCreator))
@Builder
public class Homily {

  @Id
  private Long         id;
  private String       title;
  private LocalDate    spokenAt;
  private String       speaker;
  private List<String> paragraphs;

  private AggregateReference<Illustration, Long> coverIllustration;
}
