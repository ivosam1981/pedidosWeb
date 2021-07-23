package com.ivosam.pedidosWeb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivosam.pedidosWeb.domain.Categoria;
import com.ivosam.pedidosWeb.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
