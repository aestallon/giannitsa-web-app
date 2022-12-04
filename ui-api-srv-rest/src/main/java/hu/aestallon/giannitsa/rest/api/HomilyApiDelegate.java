package hu.aestallon.giannitsa.rest.api;

import hu.aestallon.giannitsa.rest.model.HomilyDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link HomilyApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:05:18.073107600+01:00[Europe/Budapest]")
public interface HomilyApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /homily/{homilyId} : Deletes a single homily by ID.
     * Deletes the homily denoted by the id
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Homily successfully deleted. (status code 200)
     *         or Homily not found. (status code 404)
     * @see HomilyApi#deleteHomily
     */
    default ResponseEntity<Void> deleteHomily(Long homilyId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /homily/{homilyId}/coverIllustration : Deletes the cover illustration of a homily.
     * Deletes the image serving as the cover illustration for the homily specified by the provided ID. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Image deleted successfully. (status code 200)
     *         or Homily does not exist. (status code 412)
     * @see HomilyApi#deleteHomilyCoverIllustration
     */
    default ResponseEntity<Void> deleteHomilyCoverIllustration(Long homilyId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /homily : Retrieves every homily.
     * Retrieves all stored homilies.
     *
     * @return Successful retrieval of every homily (status code 200)
     * @see HomilyApi#getAllHomilies
     */
    default ResponseEntity<List<HomilyDto>> getAllHomilies() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /homily/{homilyId} : Retrieves a single homily by its id.
     * Retrieves a single homily by its id.
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Success (status code 200)
     * @see HomilyApi#getHomily
     */
    default ResponseEntity<HomilyDto> getHomily(Long homilyId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /homily/{homilyId}/coverIllustration : Retrieves the cover illustration of a homily.
     * Retrieves the image serving as the cover illustration for the homily specified by the provided ID. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Image retrieved successfully. (status code 200)
     *         or Homily has no cover illustration. (status code 204)
     *         or Homily does not exist. (status code 412)
     * @see HomilyApi#getHomilyCoverIllustration
     */
    default ResponseEntity<org.springframework.core.io.Resource> getHomilyCoverIllustration(Long homilyId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /homily : Uploads a new homily.
     * 
     *
     * @param homily  (required)
     * @param content  (optional)
     * @return Ok (status code 200)
     * @see HomilyApi#postHomily
     */
    default ResponseEntity<Void> postHomily(HomilyDto homily,
        MultipartFile content) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /homily/{homilyId}/coverIllustration : Sets an image as a homily cover photo.
     * Sets the specified image as the homily&#39;s cover illustration. 
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @param body  (required)
     * @return Ok (status code 200)
     *         or Homily ID is invalid (status code 412)
     * @see HomilyApi#setHomilyCoverIllustration
     */
    default ResponseEntity<Void> setHomilyCoverIllustration(Long homilyId,
        MultipartFile body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /homily/{homilyId} : Updates the data of a single homily.
     * Updates the contents of a single homily
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @param homilyDto  (required)
     * @return Success (status code 200)
     *         or Homily not found (status code 404)
     * @see HomilyApi#updateHomily
     */
    default ResponseEntity<HomilyDto> updateHomily(Long homilyId,
        HomilyDto homilyDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
