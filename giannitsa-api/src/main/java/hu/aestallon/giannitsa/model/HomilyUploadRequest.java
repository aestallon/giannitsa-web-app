package hu.aestallon.giannitsa.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hu.aestallon.giannitsa.model.Homily;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HomilyUploadRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
public class HomilyUploadRequest {

  @JsonProperty("homily")
  private Homily homily;

  @JsonProperty("content")
  private org.springframework.core.io.Resource content;

  public HomilyUploadRequest homily(Homily homily) {
    this.homily = homily;
    return this;
  }

  /**
   * Get homily
   * @return homily
  */
  @NotNull @Valid 
  @Schema(name = "homily", required = true)
  public Homily getHomily() {
    return homily;
  }

  public void setHomily(Homily homily) {
    this.homily = homily;
  }

  public HomilyUploadRequest content(org.springframework.core.io.Resource content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid 
  @Schema(name = "content", required = false)
  public org.springframework.core.io.Resource getContent() {
    return content;
  }

  public void setContent(org.springframework.core.io.Resource content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomilyUploadRequest homilyUploadRequest = (HomilyUploadRequest) o;
    return Objects.equals(this.homily, homilyUploadRequest.homily) &&
        Objects.equals(this.content, homilyUploadRequest.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homily, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomilyUploadRequest {\n");
    sb.append("    homily: ").append(toIndentedString(homily)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

