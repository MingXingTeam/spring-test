package com.hexin.maomao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class SpringConfig {
	
	@Bean
	public Person person(){
		return new Person();
	}
}
