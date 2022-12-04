package hu.aestallon.giannitsa.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceCreator))
public class Illustration {

  @Id
  private Long   id;
  private String name;
  private byte[] imagebytes;

  public Illustration(String name, byte[] imagebytes) {
    this.name = name;
    this.imagebytes = imagebytes;
  }

}
