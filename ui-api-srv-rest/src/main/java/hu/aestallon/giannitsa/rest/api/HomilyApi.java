/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package hu.aestallon.giannitsa.rest.api;

import hu.aestallon.giannitsa.rest.model.HomilyDto;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:55:12.135624600+01:00[Europe/Budapest]")
@Validated
@Tag(name = "homily", description = "Endpoints relating to CRUD operations for homilies.")
public interface HomilyApi {

    default HomilyApiDelegate getDelegate() {
        return new HomilyApiDelegate() {};
    }

    /**
     * DELETE /homily/{homilyId} : Deletes a single homily by ID.
     * Deletes the homily denoted by the id
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Homily successfully deleted. (status code 200)
     *         or Homily not found. (status code 404)
     */
    @Operation(
        operationId = "deleteHomily",
        summary = "Deletes a single homily by ID.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Homily successfully deleted."),
            @ApiResponse(responseCode = "404", description = "Homily not found.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/homily/{homilyId}"
    )
    default ResponseEntity<Void> deleteHomily(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId
    ) {
        return getDelegate().deleteHomily(homilyId);
    }


    /**
     * DELETE /homily/{homilyId}/coverIllustration : Deletes the cover illustration of a homily.
     * Deletes the image serving as the cover illustration for the homily specified by the provided ID. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Image deleted successfully. (status code 200)
     *         or Homily does not exist. (status code 412)
     */
    @Operation(
        operationId = "deleteHomilyCoverIllustration",
        summary = "Deletes the cover illustration of a homily.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Image deleted successfully."),
            @ApiResponse(responseCode = "412", description = "Homily does not exist.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/homily/{homilyId}/coverIllustration"
    )
    default ResponseEntity<Void> deleteHomilyCoverIllustration(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId
    ) {
        return getDelegate().deleteHomilyCoverIllustration(homilyId);
    }


    /**
     * GET /homily : Retrieves every homily.
     * Retrieves all stored homilies.
     *
     * @return Successful retrieval of every homily (status code 200)
     */
    @Operation(
        operationId = "getAllHomilies",
        summary = "Retrieves every homily.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful retrieval of every homily", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HomilyDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/homily",
        produces = { "application/json" }
    )
    default ResponseEntity<List<HomilyDto>> getAllHomilies(
        
    ) {
        return getDelegate().getAllHomilies();
    }


    /**
     * GET /homily/{homilyId} : Retrieves a single homily by its id.
     * Retrieves a single homily by its id.
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "getHomily",
        summary = "Retrieves a single homily by its id.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HomilyDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/homily/{homilyId}",
        produces = { "application/json" }
    )
    default ResponseEntity<HomilyDto> getHomily(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId
    ) {
        return getDelegate().getHomily(homilyId);
    }


    /**
     * GET /homily/{homilyId}/coverIllustration : Retrieves the cover illustration of a homily.
     * Retrieves the image serving as the cover illustration for the homily specified by the provided ID. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Image retrieved successfully. (status code 200)
     *         or Homily has no cover illustration. (status code 204)
     *         or Homily does not exist. (status code 412)
     */
    @Operation(
        operationId = "getHomilyCoverIllustration",
        summary = "Retrieves the cover illustration of a homily.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Image retrieved successfully.", content = {
                @Content(mediaType = "application/octet-stream", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
            }),
            @ApiResponse(responseCode = "204", description = "Homily has no cover illustration."),
            @ApiResponse(responseCode = "412", description = "Homily does not exist.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/homily/{homilyId}/coverIllustration",
        produces = { "application/octet-stream" }
    )
    default ResponseEntity<org.springframework.core.io.Resource> getHomilyCoverIllustration(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId
    ) {
        return getDelegate().getHomilyCoverIllustration(homilyId);
    }


    /**
     * POST /homily : Uploads a new homily.
     * 
     *
     * @param homily  (required)
     * @param content  (optional)
     * @return Ok (status code 200)
     */
    @Operation(
        operationId = "postHomily",
        summary = "Uploads a new homily.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/homily",
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<Void> postHomily(
        @Parameter(name = "homily", description = "", required = true) @Valid @RequestParam(value = "homily", required = true) HomilyDto homily,
        @Parameter(name = "content", description = "") @RequestPart(value = "content", required = false) MultipartFile content
    ) {
        return getDelegate().postHomily(homily, content);
    }


    /**
     * POST /homily/{homilyId}/coverIllustration : Sets an image as a homily cover photo.
     * Sets the specified image as the homily&#39;s cover illustration. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @param image  (required)
     * @return Ok (status code 200)
     *         or Homily ID is invalid (status code 412)
     */
    @Operation(
        operationId = "setHomilyCoverIllustration",
        summary = "Sets an image as a homily cover photo.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "412", description = "Homily ID is invalid")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/homily/{homilyId}/coverIllustration",
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<Void> setHomilyCoverIllustration(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId,
        @Parameter(name = "image", description = "", required = true) @RequestPart(value = "image", required = true) MultipartFile image
    ) {
        return getDelegate().setHomilyCoverIllustration(homilyId, image);
    }


    /**
     * PUT /homily/{homilyId} : Updates the data of a single homily.
     * Updates the contents of a single homily
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @param homilyDto  (required)
     * @return Success (status code 200)
     *         or Homily not found (status code 404)
     */
    @Operation(
        operationId = "updateHomily",
        summary = "Updates the data of a single homily.",
        tags = { "homily" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HomilyDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Homily not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/homily/{homilyId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<HomilyDto> updateHomily(
        @Parameter(name = "homilyId", description = "The ID of the homily to retrieve", required = true) @PathVariable("homilyId") Long homilyId,
        @Parameter(name = "HomilyDto", description = "", required = true) @Valid @RequestBody HomilyDto homilyDto
    ) {
        return getDelegate().updateHomily(homilyId, homilyDto);
    }

}
