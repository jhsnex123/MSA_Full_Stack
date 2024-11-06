package com.example.springsecurityedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.springsecurityedu.repository"})
public class SpringsecurityeduApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityeduApplication.class, args);
	}

}
