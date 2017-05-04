package com.bakhtiyor.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageRenderer mr = context.getBean(MessageRenderer.class);
		MessageProvider mp = context.getBean(MessageProvider.class);

		mr.setMessageProvider(mp);
		mr.render();
	}
}