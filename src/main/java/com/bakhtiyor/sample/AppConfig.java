package com.bakhtiyor.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public MessageProvider messageProvider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer messageRenderer() {
		return new StandardOutMessageRenderer();
	}
}