package pl.edu.agh.softwarestudio.angel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import pl.edu.agh.softwarestudio.angel.places.HelpPlace;
import pl.edu.agh.softwarestudio.angel.places.HelpPlaceRepo;

import java.util.List;

@SpringBootApplication
//@EnableJpaRepositories
//@EnableAutoConfiguration
public class AngelApplication implements CommandLineRunner {
//	public static ApplicationContext ctx;
	@Autowired
	private HelpPlaceRepo helpPlaceRepo;
	public static void main(String[] args) {
		SpringApplication.run(AngelApplication.class, args);

	}

	@Override
	public void run(String ... args){
		List<HelpPlace> hps = helpPlaceRepo.findAll();
		hps.forEach(System.out :: println);
	}

	/**
	 * 	Function used to set native security configuration
	 */
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests(authorize -> authorize
						.mvcMatchers("/api/**").permitAll()
				)
				.csrf().disable();

		return http.build();
	}
}
