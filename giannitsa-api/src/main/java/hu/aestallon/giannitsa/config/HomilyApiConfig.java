package hu.aestallon.giannitsa.config;

import hu.aestallon.giannitsa.api.HomilyApiDelegate;
import hu.aestallon.giannitsa.impl.HomilyApiDelegateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"hu.aestallon.giannitsa.api"})
public class HomilyApiConfig {

  @Bean
  HomilyApiDelegate homilyApiDelegate() {
    return new HomilyApiDelegateImpl();
  }

}
