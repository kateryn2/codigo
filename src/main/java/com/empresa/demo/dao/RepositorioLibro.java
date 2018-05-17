package com.empresa.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.empresa.demo.model.Libro;

public interface RepositorioLibro extends JpaRepository<Libro, Long>{
	
	@SuppressWarnings("unchecked")
	Libro save(Libro libro);

	
}
