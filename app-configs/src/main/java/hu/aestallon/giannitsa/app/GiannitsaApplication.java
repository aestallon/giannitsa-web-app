package hu.aestallon.giannitsa.app;

import hu.aestallon.giannitsa.config.HomilyApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Import({HomilyApiConfig.class})
public class GiannitsaApplication {

  public static void main(String[] args) {
    SpringApplication.run(GiannitsaApplication.class, args);
  }

}
