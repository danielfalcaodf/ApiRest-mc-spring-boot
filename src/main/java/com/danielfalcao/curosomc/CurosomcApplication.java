package com.danielfalcao.curosomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danielfalcao.curosomc.domain.Categoria;
import com.danielfalcao.curosomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CurosomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurosomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat = new Categoria(null, "Informática");
		Categoria cat1 = new Categoria(null, "Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat, cat1));

	}

}
