package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import hu.aestallon.giannitsa.rest.model.ServiceDto;
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
 * ServiceDayDto
 */

@JsonTypeName("ServiceDay")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ServiceDayDto {

  @JsonProperty("issue")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issue;

  @JsonProperty("feast")
  private String feast;

  @JsonProperty("services")
  @Valid
  private java.util.List<ServiceDto> services = null;

  public ServiceDayDto issue(LocalDate issue) {
    this.issue = issue;
    return this;
  }

  /**
   * Get issue
   * @return issue
  */
  @Valid 
  @Schema(name = "issue", example = "Sun Dec 25 01:00:00 CET 2022", required = false)
  public LocalDate getIssue() {
    return issue;
  }

  public void setIssue(LocalDate issue) {
    this.issue = issue;
  }

  public ServiceDayDto feast(String feast) {
    this.feast = feast;
    return this;
  }

  /**
   * Get feast
   * @return feast
  */
  
  @Schema(name = "feast", example = "Christmas", required = false)
  public String getFeast() {
    return feast;
  }

  public void setFeast(String feast) {
    this.feast = feast;
  }

  public ServiceDayDto services(java.util.List<ServiceDto> services) {
    this.services = services;
    return this;
  }

  public ServiceDayDto addServicesItem(ServiceDto servicesItem) {
    if (this.services == null) {
      this.services = new java.util.ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  */
  @Valid 
  @Schema(name = "services", required = false)
  public java.util.List<ServiceDto> getServices() {
    return services;
  }

  public void setServices(java.util.List<ServiceDto> services) {
    this.services = services;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDayDto serviceDay = (ServiceDayDto) o;
    return Objects.equals(this.issue, serviceDay.issue) &&
        Objects.equals(this.feast, serviceDay.feast) &&
        Objects.equals(this.services, serviceDay.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, feast, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDayDto {\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    feast: ").append(toIndentedString(feast)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

