package com.ivosam.pedidosWeb.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivosam.pedidosWeb.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1l, "Informatica");
		Categoria cat2 = new Categoria(2l, "Escritorio");
		
		return Arrays.asList(cat1, cat2);
	}
	
	
}
