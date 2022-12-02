package hu.aestallon.giannitsa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api")
public class GiannitsaApplication {

  public static void main(String[] args) {
    SpringApplication.run(GiannitsaApplication.class, args);
  }

  @GetMapping("api/example")
  public String exampleText(){
    return "kecske";
  }

}
