package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Test4Application {

	private static final Logger log = LoggerFactory.getLogger(Test4Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Test4Application.class);
	}

}