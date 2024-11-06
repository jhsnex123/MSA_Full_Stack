package com.example.springnews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
/*@EnableJpaRepositories(basePackages = {"com.example.springnews.repository"})
@EntityScan(basePackages = {"com.example.springnews.entity"})*/
public class SpringnewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringnewsApplication.class, args);
	}

}
