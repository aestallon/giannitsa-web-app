package hu.aestallon.giannitsa.app;

import hu.aestallon.giannitsa.app.config.GiannitsaAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({GiannitsaAppConfig.class})
public class GiannitsaApplication {

  public static void main(String[] args) {
    SpringApplication.run(GiannitsaApplication.class, args);
  }
}
