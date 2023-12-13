package com.example.crudProducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class CrudProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProductoApplication.class, args);
	}
	}

