package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import hu.aestallon.giannitsa.rest.model.ServiceDayDto;
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
 * ServiceScheduleDto
 */

@JsonTypeName("ServiceSchedule")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:05:18.073107600+01:00[Europe/Budapest]")
public class ServiceScheduleDto {

  @JsonProperty("validFrom")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validFrom;

  @JsonProperty("validTill")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validTill;

  @JsonProperty("serviceDays")
  @Valid
  private java.util.List<ServiceDayDto> serviceDays = null;

  public ServiceScheduleDto validFrom(LocalDate validFrom) {
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

  public ServiceScheduleDto validTill(LocalDate validTill) {
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

  public ServiceScheduleDto serviceDays(java.util.List<ServiceDayDto> serviceDays) {
    this.serviceDays = serviceDays;
    return this;
  }

  public ServiceScheduleDto addServiceDaysItem(ServiceDayDto serviceDaysItem) {
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
  public java.util.List<ServiceDayDto> getServiceDays() {
    return serviceDays;
  }

  public void setServiceDays(java.util.List<ServiceDayDto> serviceDays) {
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
    ServiceScheduleDto serviceSchedule = (ServiceScheduleDto) o;
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
    sb.append("class ServiceScheduleDto {\n");
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

