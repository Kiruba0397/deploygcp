package com.gcp.deploy.gcpdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class GcpdeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcpdeployApplication.class, args);
	}

	@GetMapping("/hello")
	public String GCP(){
		return "Welcome to GCP";
	}

}
