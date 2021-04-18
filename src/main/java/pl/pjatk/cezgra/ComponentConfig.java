package pl.pjatk.cezgra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public FourthComponent fourthComponent() {
        return new FourthComponent("Hello from first bean");
    }

    @Bean
    public FourthComponent fourthComponent2() {
        return new FourthComponent("Hello from second bean");
    }
}
