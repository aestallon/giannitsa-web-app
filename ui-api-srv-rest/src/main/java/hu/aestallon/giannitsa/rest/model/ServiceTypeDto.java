package hu.aestallon.giannitsa.rest.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration of the possible service types. 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:55:12.135624600+01:00[Europe/Budapest]")
public enum ServiceTypeDto {
  
  MATINS("matins"),
  
  DIVINE_LITURGY("divine-liturgy"),
  
  VESPERS("vespers"),
  
  PRESANCTIFIED("presanctified"),
  
  PARAKLIS("paraklis"),
  
  MNIMOSINO("mnimosino");

  private String value;

  ServiceTypeDto(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ServiceTypeDto fromValue(String value) {
    for (ServiceTypeDto b : ServiceTypeDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

