package com.demo.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}


	@GetMapping("/message")
	public String getMessage(){
		return "This is my first docker spring boot controller";
	}
}
