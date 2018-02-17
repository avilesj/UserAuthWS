package com.hercule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class UserAuthWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthWsApplication.class, args);
	}
}
