package com.edwintumax.gestor.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.gson.Gson;

@Configuration
public class BeanConfig {
	
	@Bean
	public StringBuffer StringBuffer() {
		return new StringBuffer();
	}
	
	@Bean
	public Gson Gson() {
		return new Gson();
	}
}
