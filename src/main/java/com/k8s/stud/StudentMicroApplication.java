package com.k8s.stud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.k8s.controller"})
public class StudentMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroApplication.class, args);
	}

}
