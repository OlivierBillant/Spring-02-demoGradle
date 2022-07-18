package com.example.Spring01demoGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Spring01demoGradle.bll.Calculatrice;

@SpringBootApplication
public class Spring01DemoGradleApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("avril") //On peut aussi laiser le dev choisir le qualifier a importer.
	private Calculatrice calculatrice;

	public static void main(String[] args) {
		SpringApplication.run(Spring01DemoGradleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Coucou");
		System.out.println(calculatrice.Calculate(3, 2, "*"));

	}

}
