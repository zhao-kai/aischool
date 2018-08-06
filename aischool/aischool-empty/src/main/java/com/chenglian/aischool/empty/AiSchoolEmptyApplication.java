package com.chenglian.aischool.empty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 后勤系统主类
 * @author 赵凯
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebMvc
public class AiSchoolEmptyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiSchoolEmptyApplication.class, args);
	}

}
