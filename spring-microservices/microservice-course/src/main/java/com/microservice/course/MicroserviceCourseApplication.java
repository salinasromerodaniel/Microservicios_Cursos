package com.microservice.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//EnableFeignClients para habilitar cliente feign dentro del microservicio
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCourseApplication.class, args);
	}

}
