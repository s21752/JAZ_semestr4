package pl.pjatk.cezgra.zjazd2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PojoConfig {

    @Bean
    public JavaPojo javaPojo() {
        return new JavaPojo("name", 0, 'a', 5.5f);
    }

    @Bean
    public List<String> defaultData() {
        return List.of("raz", "dwa", "trzy", "cztery", "piec");
    }
}
