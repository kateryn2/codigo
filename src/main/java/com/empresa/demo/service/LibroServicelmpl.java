package com.empresa.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.demo.dao.RepositorioLibro;
import com.empresa.demo.model.Libro;

@Service

public class LibroServicelmpl implements LibroService {

	@Autowired
	 protected RepositorioLibro repositorioLibro;

	@Override
	public Libro save(Libro libro) {
	
		return this.repositorioLibro.save(libro);
	}

	@Override
	public List<Libro> finAll() {	
	return this.repositorioLibro.findAll();
			
	}

	@Override
	public void deleteLibro(Long id) {
		this.repositorioLibro.deleteById(id);
		
	}

	
}
