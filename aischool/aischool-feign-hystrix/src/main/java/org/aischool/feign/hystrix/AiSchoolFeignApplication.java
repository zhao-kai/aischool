package org.aischool.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AiSchoolFeignApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AiSchoolFeignApplication.class,args);
    }
}
