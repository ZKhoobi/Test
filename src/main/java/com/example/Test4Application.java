package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:application.yml")
public class Test4Application {

	private static final Logger log = LoggerFactory.getLogger(Test4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Test4Application.class);
	}

}