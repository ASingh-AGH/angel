package project.softwarestudio.angel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AngelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngelApplication.class, args);
	}

	/**
	 * Test method used to check configuration of environment, should be removed in production
	 * @param name		Name to be used in parsed string
	 * @return			Parsed string
	 */
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	/**
	 * 	Function used to set native security configuration
	 */
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
				// ...
				.authorizeHttpRequests(authorize -> authorize
						.mvcMatchers("/hello").permitAll()

				);

		return http.build();
	}
}
