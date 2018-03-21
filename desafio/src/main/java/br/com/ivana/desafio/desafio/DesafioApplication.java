package br.com.ivana.desafio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.ivana.desafio.controller.RestauranteController;

@ComponentScan(basePackageClasses=RestauranteController.class)
@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
}