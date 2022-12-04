package hu.aestallon.giannitsa.rest.api;

import hu.aestallon.giannitsa.rest.model.ServiceScheduleDto;
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
 * A delegate to be called by the {@link ScheduleApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:55:12.135624600+01:00[Europe/Budapest]")
public interface ScheduleApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /schedule : Retrieves the identifiers of every stored service schedule.
     * Retrieves the identifiers of every stored service schedule. 
     *
     * @return The ID array of stored schedules (status code 200)
     * @see ScheduleApi#getSchedules
     */
    default ResponseEntity<List<Long>> getSchedules() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "0";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /schedule : Uploads a new service schedule.
     * Saves a new ServiceSchedule in persistent storage.
     *
     * @param serviceScheduleDto  (required)
     * @return Schedule saved. (status code 200)
     *         or The provided schedule is invalid. It may contain services outside the schedules validity period, or contain nonsensical times, etc.  (status code 406)
     * @see ScheduleApi#schedulePost
     */
    default ResponseEntity<Void> schedulePost(ServiceScheduleDto serviceScheduleDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
