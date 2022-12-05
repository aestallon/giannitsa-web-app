package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@JsonTypeName("Homily")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class HomilyDto {

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

  public HomilyDto id(Long id) {
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

  public HomilyDto title(String title) {
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

  public HomilyDto date(LocalDate date) {
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

  public HomilyDto speaker(String speaker) {
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

  public HomilyDto paragraphs(java.util.List<String> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public HomilyDto addParagraphsItem(String paragraphsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomilyDto homily = (HomilyDto) o;
    return Objects.equals(this.id, homily.id) &&
        Objects.equals(this.title, homily.title) &&
        Objects.equals(this.date, homily.date) &&
        Objects.equals(this.speaker, homily.speaker) &&
        Objects.equals(this.paragraphs, homily.paragraphs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, date, speaker, paragraphs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomilyDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    speaker: ").append(toIndentedString(speaker)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
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

