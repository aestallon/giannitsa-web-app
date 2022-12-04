package hu.aestallon.giannitsa.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

public class Illustration {

  @Id
  private Long id;

  private String name;

  private byte[] imagebytes;

  @PersistenceCreator
  protected Illustration() {}

  public Illustration(String name, byte[] imagebytes) {
    this.name = name;
    this.imagebytes = imagebytes;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public byte[] getImagebytes() {
    return imagebytes;
  }

  public void setImagebytes(byte[] imagebytes) {
    this.imagebytes = imagebytes;
  }
}
