package com.basic.spring.basicspring;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class BasicSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringApplication.class, args);
		System.out.println("Spring Boot Version: " + SpringVersion.getVersion());
	}

	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);

		return localeResolver;
	}

	// @Bean
	// public ResourceBundleMessageSource messageSource() {
	// ResourceBundleMessageSource messageSource = new
	// ResourceBundleMessageSource();
	// messageSource.setBasename("messages");
	// return messageSource;
	// }

}
