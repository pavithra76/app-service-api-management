package io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealworldApplication {

	public static void main(String[] args) {
		System.out.println("Real World");
		SpringApplication.run(RealworldApplication.class, args);
	}
}
