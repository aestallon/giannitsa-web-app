package hu.aestallon.giannitsa.domain.api.config;

import hu.aestallon.giannitsa.domain.api.HomilyService;
import hu.aestallon.giannitsa.domain.api.HomilyServiceImpl;
import hu.aestallon.giannitsa.domain.repository.HomilyRepository;
import hu.aestallon.giannitsa.domain.repository.IllustrationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainApiConfig {

    @Bean
    HomilyService homilyService(HomilyRepository homilyRepository,
                                IllustrationRepository illustrationRepository) {
        return new HomilyServiceImpl(homilyRepository, illustrationRepository);
    }
}
