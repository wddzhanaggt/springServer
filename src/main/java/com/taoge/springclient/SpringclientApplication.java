package com.taoge.springclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringclientApplication.class, args);
	}
}
