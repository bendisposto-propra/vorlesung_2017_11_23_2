package de.hhu.stups.springhello;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	
	@Bean
	public Random getRand() {
		return new Random();
	}

}
