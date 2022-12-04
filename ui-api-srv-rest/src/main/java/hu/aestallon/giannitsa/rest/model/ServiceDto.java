package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import hu.aestallon.giannitsa.rest.model.ServiceTypeDto;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceDto
 */

@JsonTypeName("Service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:05:18.073107600+01:00[Europe/Budapest]")
public class ServiceDto {

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("serviceType")
  private ServiceTypeDto serviceType;

  public ServiceDto startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", example = "06:00", required = false)
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ServiceDto serviceType(ServiceTypeDto serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  */
  @Valid 
  @Schema(name = "serviceType", required = false)
  public ServiceTypeDto getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceTypeDto serviceType) {
    this.serviceType = serviceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDto service = (ServiceDto) o;
    return Objects.equals(this.startTime, service.startTime) &&
        Objects.equals(this.serviceType, service.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDto {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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

