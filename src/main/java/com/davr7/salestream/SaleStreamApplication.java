package com.davr7.salestream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SaleStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleStreamApplication.class, args);
	}

}
