package com.web.develop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class EduardostevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduardostevenApplication.class, args);
	}

}
