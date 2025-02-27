package com.hadid.clickbuy.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication()
@EnableJpaAuditing
public class ClickBuyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClickBuyRestApiApplication.class, args);
	}

}
