package com.footballapp.footballapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = MyController.class)
public class FootballappApplication {	
	public static void main(String[] args) {
		SpringApplication.run(FootballappApplication.class, args);
	}
}