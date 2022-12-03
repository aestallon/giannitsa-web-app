package hu.aestallon.giannitsa.api;

import hu.aestallon.giannitsa.model.Homily;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T18:20:37.870619300+01:00[Europe/Budapest]")
@Controller
@RequestMapping("${openapi.giannitsaWebApp.base-path:}")
public class HomilyApiController implements HomilyApi {

    private final HomilyApiDelegate delegate;

    public HomilyApiController(@Autowired(required = false) HomilyApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new HomilyApiDelegate() {});
    }

    @Override
    public HomilyApiDelegate getDelegate() {
        return delegate;
    }

}
