package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnumexercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnumexercicioApplication.class, args);

		Perguntas pergunta = new Perguntas();
		pergunta.ex01();
	}


	

}
