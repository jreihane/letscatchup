package com.letscatchup.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.letscatchup.core.BaseApp;

@SpringBootApplication
public class App extends BaseApp {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
