package com.elan.rides.reviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RideReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideReviewServiceApplication.class, args);
	}

}
