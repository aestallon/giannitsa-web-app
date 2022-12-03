package hu.aestallon.giannitsa.api;

import hu.aestallon.giannitsa.model.Homily;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
public interface HomilyApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /homily/{homilyId}
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
     * GET /homily : Retrieves every homily.
     * Retrieves all stored homilies.
     *
     * @return Successful retrieval of every homily (status code 200)
     * @see HomilyApi#getAllHomilies
     */
    default ResponseEntity<List<Homily>> getAllHomilies() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"coverIllustration\" : \"\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /homily/{homilyId}
     * Retrieves a single homily by its id.
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @return Success (status code 200)
     * @see HomilyApi#getHomily
     */
    default ResponseEntity<Homily> getHomily(Long homilyId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"coverIllustration\" : \"\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
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
    default ResponseEntity<Void> postHomily(Homily homily,
        MultipartFile content) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /homily/{homilyId}
     * Updates the contents of a single homily
     *
     * @param homilyId The ID of the homily to retrieve (required)
     * @param homily  (required)
     * @return Success (status code 200)
     *         or Homily not found (status code 404)
     * @see HomilyApi#updateHomily
     */
    default ResponseEntity<Homily> updateHomily(Long homilyId,
        Homily homily) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"2022-01-01T00:00:00.000+00:00\", \"coverIllustration\" : \"\", \"speaker\" : \"Fr John\", \"id\" : 1, \"title\" : \"The Prodigal Son 2 - Electric Boogaloo\", \"paragraphs\" : [ \"First paragraph.\", \"Second paragraph.\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
