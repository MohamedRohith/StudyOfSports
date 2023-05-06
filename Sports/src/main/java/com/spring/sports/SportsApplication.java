package com.spring.sports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "CRICKET CHAMPIONSHIP",
				version = "1.2.3",
				description = "Details of Batsman",
				contact = @Contact(
						name = "MOHAMED ROHITH",
						email = "rohithmohamedk@gmail.com"
						)
				)
		)
public class SportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsApplication.class, args);
	}

}
