package com.te.myfitnessapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyfitnessAppApplication {

	public static void main(String[] args) {
		
		System.out.println("myfitnessapp start");
		SpringApplication.run(MyfitnessAppApplication.class, args);
		
		System.out.println("myfitnessapp end");
	}
	
	

}
