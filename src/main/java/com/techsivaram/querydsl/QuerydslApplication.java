package com.techsivaram.querydsl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.*" })
public class QuerydslApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}
}
