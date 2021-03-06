package com.empresa.demo.service;

import java.util.List;

import com.empresa.demo.model.Libro;

public interface LibroService {
	
	/**
	 * Guarda un libro
	 * @param libro
	 * @return Libro guardado
	 */
	Libro save(Libro libro);

	/**
	 * Recupera la lista de libros
	 * @return lista de libros
	 */
	List<Libro> finAll();

	/**
	 * Elimina un usuario con el identificador
	 * @param id
	 */
	void deleteLibro(Long id);

	

}
