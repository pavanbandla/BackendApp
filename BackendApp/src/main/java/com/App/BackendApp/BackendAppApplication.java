package com.App.BackendApp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.rmi.server.LogStream.log;

@SpringBootApplication
public class BackendAppApplication {


	private static final Logger log = LogManager.getLogger(BackendAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BackendAppApplication.class, args);
	}
}
