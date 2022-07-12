package org.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class exampleapp {

	public static void main(String[] args) throws Exception {
//		System.out.println("BP_OCI_VERSION = " + System.getenv("BP_OCI_VERSION"));
		SpringApplication.run(exampleapp.class, args);
	}

}
