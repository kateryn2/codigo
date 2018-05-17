package com.empresa.demo.service;

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
}
