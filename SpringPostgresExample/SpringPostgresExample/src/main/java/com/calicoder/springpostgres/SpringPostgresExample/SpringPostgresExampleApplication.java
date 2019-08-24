package com.calicoder.springpostgres.SpringPostgresExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringPostgresExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgresExampleApplication.class, args);
	}

}
