package hu.aestallon.giannitsa.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalDate;
import java.util.List;


public class Homily {

  @Id
  private Long id;

  private String title;

  private LocalDate spokenAt;

  private String speaker;

  private List<String> paragraphs;

  private AggregateReference<Illustration, Long> coverIllustration;

  @PersistenceCreator
  private Homily() {}

  public Homily(String title, LocalDate spokenAt, String speaker, List<String> paragraphs) {
    this.title = title;
    this.spokenAt = spokenAt;
    this.speaker = speaker;
    this.paragraphs = paragraphs;
  }

  public Homily(Long id, String title, LocalDate spokenAt, String speaker,
                List<String> paragraphs) {
    this.id = id;
    this.title = title;
    this.spokenAt = spokenAt;
    this.speaker = speaker;
    this.paragraphs = paragraphs;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LocalDate getSpokenAt() {
    return spokenAt;
  }

  public void setSpokenAt(LocalDate spokenAt) {
    this.spokenAt = spokenAt;
  }

  public String getSpeaker() {
    return speaker;
  }

  public void setSpeaker(String speaker) {
    this.speaker = speaker;
  }

  public List<String> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<String> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public AggregateReference<Illustration, Long> getCoverIllustration() {
    return coverIllustration;
  }

  public void setCoverIllustration(AggregateReference<Illustration, Long> coverIllustration) {
    this.coverIllustration = coverIllustration;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Homily{");
    sb.append("id=").append(id);
    sb.append(", title='").append(title).append('\'');
    sb.append(", date=").append(spokenAt);
    sb.append(", speaker='").append(speaker).append('\'');
    sb.append(", paragraphs=").append(paragraphs);
    sb.append(", coverIllustration=").append(coverIllustration);
    sb.append('}');
    return sb.toString();
  }
}
