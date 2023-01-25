package com.wysokinski.GitApiFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GitApiFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApiFeignApplication.class, args);
	}

}
