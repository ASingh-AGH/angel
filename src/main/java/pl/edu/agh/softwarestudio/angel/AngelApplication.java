package pl.edu.agh.softwarestudio.angel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class AngelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngelApplication.class, args);
	}



	/**
	 * 	Function used to set native security configuration
	 */
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests(authorize -> authorize
						.mvcMatchers("/api/**").permitAll()
				);

		return http.build();
	}
}
