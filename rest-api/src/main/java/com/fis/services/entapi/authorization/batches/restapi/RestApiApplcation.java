package com.fis.services.entapi.authorization.batches.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.fis.services.entapi.authorization.batches.restapi.*",
		"com.fis.services.entapi.authorization.batches.businesslogic.*"},
			exclude = DataSourceAutoConfiguration.class)
public class RestApiApplcation {

	public static void main(String[] args) {
	
		SpringApplication.run(RestApiApplcation.class, args);
	}

}
