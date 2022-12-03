package hu.aestallon.giannitsa.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import hu.aestallon.giannitsa.model.ServiceDay;
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
 * ServiceSchedule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
public class ServiceSchedule {

  @JsonProperty("validFrom")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validFrom;

  @JsonProperty("validTill")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validTill;

  @JsonProperty("serviceDays")
  @Valid
  private java.util.List<ServiceDay> serviceDays = null;

  public ServiceSchedule validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The first day when this service schedule is in effect. 
   * @return validFrom
  */
  @Valid 
  @Schema(name = "validFrom", example = "Sat Jan 01 01:00:00 CET 2022", description = "The first day when this service schedule is in effect. ", required = false)
  public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public ServiceSchedule validTill(LocalDate validTill) {
    this.validTill = validTill;
    return this;
  }

  /**
   * The last day when this service schedule is in effect. 
   * @return validTill
  */
  @Valid 
  @Schema(name = "validTill", example = "Mon Jan 31 01:00:00 CET 2022", description = "The last day when this service schedule is in effect. ", required = false)
  public LocalDate getValidTill() {
    return validTill;
  }

  public void setValidTill(LocalDate validTill) {
    this.validTill = validTill;
  }

  public ServiceSchedule serviceDays(java.util.List<ServiceDay> serviceDays) {
    this.serviceDays = serviceDays;
    return this;
  }

  public ServiceSchedule addServiceDaysItem(ServiceDay serviceDaysItem) {
    if (this.serviceDays == null) {
      this.serviceDays = new java.util.ArrayList<>();
    }
    this.serviceDays.add(serviceDaysItem);
    return this;
  }

  /**
   * Get serviceDays
   * @return serviceDays
  */
  @Valid 
  @Schema(name = "serviceDays", required = false)
  public java.util.List<ServiceDay> getServiceDays() {
    return serviceDays;
  }

  public void setServiceDays(java.util.List<ServiceDay> serviceDays) {
    this.serviceDays = serviceDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSchedule serviceSchedule = (ServiceSchedule) o;
    return Objects.equals(this.validFrom, serviceSchedule.validFrom) &&
        Objects.equals(this.validTill, serviceSchedule.validTill) &&
        Objects.equals(this.serviceDays, serviceSchedule.serviceDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validTill, serviceDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSchedule {\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
    sb.append("    serviceDays: ").append(toIndentedString(serviceDays)).append("\n");
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

