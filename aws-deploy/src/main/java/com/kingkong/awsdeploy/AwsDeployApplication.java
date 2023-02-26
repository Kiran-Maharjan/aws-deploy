package com.kingkong.awsdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDeployApplication {

	@GetMapping("/")
	public String index(){
		return "Welcome to AWS first deploy";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsDeployApplication.class, args);
	}

}
