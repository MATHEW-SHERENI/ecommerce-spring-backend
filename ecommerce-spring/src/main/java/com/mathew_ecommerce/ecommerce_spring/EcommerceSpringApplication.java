package com.mathew_ecommerce.ecommerce_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.mathew_ecommerce.ecommerce_spring.model")
@EnableJpaRepositories(basePackages = "com.mathew_ecommerce.ecommerce_spring.repositories")
public class EcommerceSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
