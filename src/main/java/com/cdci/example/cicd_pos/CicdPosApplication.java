package com.cdci.example.cicd_pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Main application class for the CI/CD POS application

@SpringBootApplication
public class CicdPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdPosApplication.class, args);
		System.out.println("Hello world/");
	}

}
