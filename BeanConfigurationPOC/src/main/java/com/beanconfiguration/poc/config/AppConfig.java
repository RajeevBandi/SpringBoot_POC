package com.beanconfiguration.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beanconfiguration.poc.model.Engine;

@Configuration
public class AppConfig {
	
	// Configuring a basic Engine bean
	@Bean
	public Engine engine() {
		return new Engine();
	}
	
	// Configuring Engine bean with custom configuration
    @Bean
    public Engine engineWithCustomConfig() {
    	Engine engine = new Engine();
    	engine.setType("XM");
    	return engine;
    }
}
