package pl.pjatk.cezgra.zjazd2.zaddom;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalBeanConfig {

    @Bean
    @ConditionalOnProperty(
            value = "my.custom.shouldCreate",
            havingValue = "true",
            matchIfMissing = false
    )
    ProfileDependantBean conditionalBean() {
        return new ProfileDependantBean();
    }
}
