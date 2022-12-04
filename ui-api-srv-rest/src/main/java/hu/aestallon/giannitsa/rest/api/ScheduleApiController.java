package hu.aestallon.giannitsa.rest.api;

import hu.aestallon.giannitsa.rest.model.ServiceScheduleDto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-04T21:05:18.073107600+01:00[Europe/Budapest]")
@Controller
@RequestMapping("${openapi.giannitsaWebApp.base-path:}")
public class ScheduleApiController implements ScheduleApi {

    private final ScheduleApiDelegate delegate;

    public ScheduleApiController(@Autowired(required = false) ScheduleApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ScheduleApiDelegate() {});
    }

    @Override
    public ScheduleApiDelegate getDelegate() {
        return delegate;
    }

}
