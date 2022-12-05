package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import hu.aestallon.giannitsa.rest.model.HomilyDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostHomilyRequestDto
 */

@JsonTypeName("postHomily_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PostHomilyRequestDto {

  @JsonProperty("homily")
  private HomilyDto homily;

  @JsonProperty("document")
  private org.springframework.core.io.Resource document;

  public PostHomilyRequestDto homily(HomilyDto homily) {
    this.homily = homily;
    return this;
  }

  /**
   * Get homily
   * @return homily
  */
  @NotNull @Valid 
  @Schema(name = "homily", required = true)
  public HomilyDto getHomily() {
    return homily;
  }

  public void setHomily(HomilyDto homily) {
    this.homily = homily;
  }

  public PostHomilyRequestDto document(org.springframework.core.io.Resource document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  @Valid 
  @Schema(name = "document", required = false)
  public org.springframework.core.io.Resource getDocument() {
    return document;
  }

  public void setDocument(org.springframework.core.io.Resource document) {
    this.document = document;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostHomilyRequestDto postHomilyRequest = (PostHomilyRequestDto) o;
    return Objects.equals(this.homily, postHomilyRequest.homily) &&
        Objects.equals(this.document, postHomilyRequest.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homily, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostHomilyRequestDto {\n");
    sb.append("    homily: ").append(toIndentedString(homily)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

