package com.empresa.demo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.demo.model.Libro;
import com.empresa.demo.service.LibroService;
import com.empresa.demo.util.RespuestaRest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class LibroController {

	 @Autowired
	 protected LibroService libroService;

	 
	 protected ObjectMapper mapper;
	 
	 @RequestMapping(value="/saveOrUpdate", method= RequestMethod.POST)
	 public RespuestaRest saveOrUpdate(@RequestBody String libroJson) 
		 throws JsonParseException, JsonMappingException, IOException{
	  this.mapper=new ObjectMapper();
		 
		 //se convierte json en un objeto
	Libro libro =this.mapper.readValue(libroJson, Libro.class);
		
	if(!this.validar(libro)) {
		return new RespuestaRest(HttpStatus.NOT_ACCEPTABLE.value(),
				"Los campos obligatorios no se introducieron");
	}
	
this.libroService.save(libro);

	return new RespuestaRest(HttpStatus.OK.value(), "Operación exitosa");
	
	 }
	 
	 private boolean validar (Libro libro) {
	 boolean esValido = true;
	 
	 if( libro.getNombrelibro()== "" || libro.getNombrelibro()== null) {
		 esValido = false;
		 
	 }
	 if( libro.getCostolibro()== "" || libro.getCostolibro()== null) {
		 esValido = false;
		 
	 }
	 return esValido;
 }
	 
}



