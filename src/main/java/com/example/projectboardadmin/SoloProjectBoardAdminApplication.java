package com.example.projectboardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SoloProjectBoardAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoloProjectBoardAdminApplication.class, args);
	}

}
