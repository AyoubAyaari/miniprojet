package com.ayoub.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ayoub.produits.entities.Ingenieur;

@SpringBootApplication
public class MiniprojetApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MiniprojetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Ingenieur.class);
	}

}
