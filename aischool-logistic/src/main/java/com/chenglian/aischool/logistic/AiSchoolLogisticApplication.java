package com.chenglian.aischool.logistic;

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
public class AiSchoolLogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiSchoolLogisticApplication.class, args);
	}

}
