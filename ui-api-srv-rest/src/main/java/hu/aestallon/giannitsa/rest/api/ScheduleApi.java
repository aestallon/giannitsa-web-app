/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package hu.aestallon.giannitsa.rest.api;

import hu.aestallon.giannitsa.rest.model.ServiceScheduleDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "schedule", description = "Endpoints relating to CRUD operations concerning service schedules")
public interface ScheduleApi {

    default ScheduleApiDelegate getDelegate() {
        return new ScheduleApiDelegate() {};
    }

    /**
     * GET /schedule : Retrieves the identifiers of every stored service schedule.
     * Retrieves the identifiers of every stored service schedule. 
     *
     * @return The ID array of stored schedules (status code 200)
     */
    @Operation(
        operationId = "getSchedules",
        summary = "Retrieves the identifiers of every stored service schedule.",
        tags = { "schedule" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The ID array of stored schedules", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Long.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/schedule",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Long>> getSchedules(
        
    ) {
        return getDelegate().getSchedules();
    }


    /**
     * POST /schedule : Uploads a new service schedule.
     * Saves a new ServiceSchedule in persistent storage.
     *
     * @param serviceScheduleDto  (required)
     * @return Schedule saved. (status code 200)
     *         or The provided schedule is invalid. It may contain services outside the schedules validity period, or contain nonsensical times, etc.  (status code 406)
     */
    @Operation(
        operationId = "schedulePost",
        summary = "Uploads a new service schedule.",
        tags = { "schedule" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Schedule saved."),
            @ApiResponse(responseCode = "406", description = "The provided schedule is invalid. It may contain services outside the schedules validity period, or contain nonsensical times, etc. ")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/schedule",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> schedulePost(
        @Parameter(name = "ServiceScheduleDto", description = "", required = true) @Valid @RequestBody ServiceScheduleDto serviceScheduleDto
    ) {
        return getDelegate().schedulePost(serviceScheduleDto);
    }

}
