package be.odisee.vanmoer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"be.odisee.vanmoer"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class VanMoerWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanMoerWebServiceApplication.class, args);
	}
}
