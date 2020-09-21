package com.victorlh.registrocontable.cloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistrocontableCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrocontableCloudEurekaServerApplication.class, args);
	}

}
