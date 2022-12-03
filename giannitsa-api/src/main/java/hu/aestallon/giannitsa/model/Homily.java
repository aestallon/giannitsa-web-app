package hu.aestallon.giannitsa.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A homily preached at a given date by a specified speaker, containing the paragraphs of the spoken text as well as an optional cover illustration. 
 */

@Schema(name = "Homily", description = "A homily preached at a given date by a specified speaker, containing the paragraphs of the spoken text as well as an optional cover illustration. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
public class Homily {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("speaker")
  private String speaker;

  @JsonProperty("paragraphs")
  @Valid
  private java.util.List<String> paragraphs = new java.util.ArrayList<>();

  @JsonProperty("coverIllustration")
  private org.springframework.core.io.Resource coverIllustration;

  public Homily id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this homily stored as a 64-bit number. 
   * @return id
  */
  
  @Schema(name = "id", example = "1", description = "The unique identifier of this homily stored as a 64-bit number. ", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Homily title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the homily. Should be unique, as to differentiate multiple homilies preached for the same occasion. 
   * @return title
  */
  @NotNull 
  @Schema(name = "title", example = "The Prodigal Son 2 - Electric Boogaloo", description = "The title of the homily. Should be unique, as to differentiate multiple homilies preached for the same occasion. ", required = true)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Homily date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * The date on which this homily was given. 
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", example = "Sat Jan 01 01:00:00 CET 2022", description = "The date on which this homily was given. ", required = true)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Homily speaker(String speaker) {
    this.speaker = speaker;
    return this;
  }

  /**
   * The person who gave this homily 
   * @return speaker
  */
  @NotNull 
  @Schema(name = "speaker", example = "Fr John", description = "The person who gave this homily ", required = true)
  public String getSpeaker() {
    return speaker;
  }

  public void setSpeaker(String speaker) {
    this.speaker = speaker;
  }

  public Homily paragraphs(java.util.List<String> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public Homily addParagraphsItem(String paragraphsItem) {
    this.paragraphs.add(paragraphsItem);
    return this;
  }

  /**
   * The paragraphs of the homily's text in sequential order. 
   * @return paragraphs
  */
  @NotNull 
  @Schema(name = "paragraphs", example = "[\"First paragraph.\",\"Second paragraph.\"]", description = "The paragraphs of the homily's text in sequential order. ", required = true)
  public java.util.List<String> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(java.util.List<String> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public Homily coverIllustration(org.springframework.core.io.Resource coverIllustration) {
    this.coverIllustration = coverIllustration;
    return this;
  }

  /**
   * An image to render as the cover illustration of this homily. 
   * @return coverIllustration
  */
  @Valid 
  @Schema(name = "coverIllustration", description = "An image to render as the cover illustration of this homily. ", required = false)
  public org.springframework.core.io.Resource getCoverIllustration() {
    return coverIllustration;
  }

  public void setCoverIllustration(org.springframework.core.io.Resource coverIllustration) {
    this.coverIllustration = coverIllustration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Homily homily = (Homily) o;
    return Objects.equals(this.id, homily.id) &&
        Objects.equals(this.title, homily.title) &&
        Objects.equals(this.date, homily.date) &&
        Objects.equals(this.speaker, homily.speaker) &&
        Objects.equals(this.paragraphs, homily.paragraphs) &&
        Objects.equals(this.coverIllustration, homily.coverIllustration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, date, speaker, paragraphs, coverIllustration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Homily {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    speaker: ").append(toIndentedString(speaker)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    coverIllustration: ").append(toIndentedString(coverIllustration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

