package pl.gawlowski.maciej.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"pl.gawlowski.maciej.controller", "pl.gawlowski.maciej.service"})
@SpringBootApplication
@EntityScan("pl.gawlowski.maciej.domain")
@EnableJpaRepositories("pl.gawlowski.maciej.service")
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
}
