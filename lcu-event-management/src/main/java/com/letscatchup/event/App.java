package com.letscatchup.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.letscatchup.group.domain.entity",
							"com.letscatchup.user.domain.entity",
							"com.letscatchup.event.domain.entity"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}