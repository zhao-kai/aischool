package com.chenglian.aischool.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class AiSchoolSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiSchoolSecurityApplication.class, args);
	}

}
