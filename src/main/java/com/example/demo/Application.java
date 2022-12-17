package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.controller")
@EnableAutoConfiguration (exclude = {ErrorMvcAutoConfiguration.class} )    
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
