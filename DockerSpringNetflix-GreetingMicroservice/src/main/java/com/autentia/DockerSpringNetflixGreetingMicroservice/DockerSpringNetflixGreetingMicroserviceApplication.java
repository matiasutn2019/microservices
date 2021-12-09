package com.autentia.DockerSpringNetflixGreetingMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DockerSpringNetflixGreetingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringNetflixGreetingMicroserviceApplication.class, args);
	}

}
