package co.com.operation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.operation.services.Calculator;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Calculator configCalculator() {
		System.out.println("Bean Calculator...");
		return new Calculator();

	}
	
	
}
