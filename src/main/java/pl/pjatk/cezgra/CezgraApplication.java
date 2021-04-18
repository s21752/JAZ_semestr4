package pl.pjatk.cezgra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@ImportResource({"classpath*:beanConfiguration.xml"})
public class CezgraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CezgraApplication.class, args);
	}

}
