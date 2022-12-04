package hu.aestallon.giannitsa.domain.config;

import hu.aestallon.giannitsa.domain.repository.HomilyRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(basePackageClasses = HomilyRepository.class)
@EntityScan(basePackages = {"hu.aestallon.giannitsa.domain"})
public class DomainConfig extends AbstractJdbcConfiguration {
}
