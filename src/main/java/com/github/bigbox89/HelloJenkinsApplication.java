package com.github.bigbox89;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class HelloJenkinsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HelloJenkinsApplication.class, args);
	}
}