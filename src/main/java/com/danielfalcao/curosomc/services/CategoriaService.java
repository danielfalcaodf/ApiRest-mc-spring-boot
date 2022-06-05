package com.danielfalcao.curosomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.danielfalcao.curosomc.domain.Categoria;
import com.danielfalcao.curosomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); 
		
		return obj.orElse(null);
	}

}
