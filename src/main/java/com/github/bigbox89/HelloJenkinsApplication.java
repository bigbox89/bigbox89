package com.github.bigbox89;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HelloJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJenkinsApplication.class, args);
	}
	// 1. Annotation
	@RequestMapping("/")
	// 3. Method that maps to the request route above
	public String hello() { // 3
		return "Hello World!";
	}
}
