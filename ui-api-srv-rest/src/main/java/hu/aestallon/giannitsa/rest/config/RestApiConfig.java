package hu.aestallon.giannitsa.rest.config;

import hu.aestallon.giannitsa.rest.api.HomilyApiDelegate;
import hu.aestallon.giannitsa.rest.api.ScheduleApiDelegate;
import hu.aestallon.giannitsa.rest.impl.HomilyApiDelegateImpl;
import hu.aestallon.giannitsa.rest.impl.ScheduleApiDelegateImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"hu.aestallon.giannitsa.rest.api"})
public class RestApiConfig {

  @Bean
  HomilyApiDelegate homilyApiDelegate() {
    return new HomilyApiDelegateImpl();
  }

  @Bean
  ScheduleApiDelegate scheduleApiDelegate() {
    return new ScheduleApiDelegateImpl();
  }
}
