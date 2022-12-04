package hu.aestallon.giannitsa.app.config;

import hu.aestallon.giannitsa.app.GiannitsaApplication;
import hu.aestallon.giannitsa.rest.config.RestApiConfig;
import hu.aestallon.giannitsa.domain.api.config.DomainApiConfig;
import hu.aestallon.giannitsa.domain.config.DomainConfig;
import hu.aestallon.giannitsa.domain.model.Homily;
import hu.aestallon.giannitsa.domain.model.Illustration;
import hu.aestallon.giannitsa.domain.repository.HomilyRepository;
import hu.aestallon.giannitsa.domain.repository.IllustrationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.List;

@Configuration
@Import({RestApiConfig.class, DomainApiConfig.class, DomainConfig.class})
public class GiannitsaAppConfig {

  @Bean
  CommandLineRunner commandLineRunner(HomilyRepository homilyRepository,
                                      IllustrationRepository illustrationRepository) {

    return args -> {
      InputStream in = GiannitsaApplication.class
          .getResourceAsStream("/catdance.png");
      assert in != null;
      byte[] pic = in.readAllBytes();

      var catDance = new Illustration("catdance", pic);
      Illustration savedCatDance = illustrationRepository.save(catDance);

      var h1 = new Homily(
          "Title 1",
          LocalDate.of(2022, 12, 3),
          "Speaker 1",
          List.of("Something first.", "Something second.")
      );

      var h2 = new Homily(
          "Title 2",
          LocalDate.of(2022, 12, 4),
          "Speaker 2",
          List.of("Blabla", "asdasdasfsa", "Something legible")
      );

      var h3 = new Homily(
          "Title 3",
          LocalDate.of(2022, 12, 5),
          "Speaker 3",
          List.of("Something here.")
      );
      System.out.println(h3);
      Homily savedHomily1 = homilyRepository.save(h1);
      Homily savedHomily2 = homilyRepository.save(h2);
      Homily savedHomily3 = homilyRepository.save(h3);
      System.out.println(savedHomily1);

      savedHomily1.setCoverIllustration(AggregateReference.to(savedCatDance.getId()));
      savedHomily3.setCoverIllustration(AggregateReference.to(savedCatDance.getId()));
      homilyRepository.save(savedHomily1);
      homilyRepository.save(savedHomily3);
    };
  }
}
