package hu.aestallon.giannitsa.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hu.aestallon.giannitsa.model.Service;
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
 * ServiceDay
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
public class ServiceDay {

  @JsonProperty("issue")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issue;

  @JsonProperty("feast")
  private String feast;

  @JsonProperty("services")
  @Valid
  private java.util.List<Service> services = null;

  public ServiceDay issue(LocalDate issue) {
    this.issue = issue;
    return this;
  }

  /**
   * Get issue
   * @return issue
  */
  @Valid 
  @Schema(name = "issue", required = false)
  public LocalDate getIssue() {
    return issue;
  }

  public void setIssue(LocalDate issue) {
    this.issue = issue;
  }

  public ServiceDay feast(String feast) {
    this.feast = feast;
    return this;
  }

  /**
   * Get feast
   * @return feast
  */
  
  @Schema(name = "feast", required = false)
  public String getFeast() {
    return feast;
  }

  public void setFeast(String feast) {
    this.feast = feast;
  }

  public ServiceDay services(java.util.List<Service> services) {
    this.services = services;
    return this;
  }

  public ServiceDay addServicesItem(Service servicesItem) {
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
  public java.util.List<Service> getServices() {
    return services;
  }

  public void setServices(java.util.List<Service> services) {
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
    ServiceDay serviceDay = (ServiceDay) o;
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
    sb.append("class ServiceDay {\n");
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

