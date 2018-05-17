package com.empresa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro extends EntidadPadre {
	private static final long serialVersionUID = 8320246411646322053L;
	
	@Column(name="nombre_libro",nullable=false, length=50)
	private String nombrelibro ;
	
	@Column(name="descripcion_libro",nullable=true, length=250)
	private String descripcionlibro; 
	
	@Column(name="costo_libro",nullable=false, length=20)
	private String costolibro;
	
	public String getNombrelibro() {
		return nombrelibro;
	}
	public void setNombrelibro(String nombrelibro) {
		this.nombrelibro = nombrelibro;
	}
	public String getDescripcionlibro() {
		return descripcionlibro;
	}
	public void setDescripcionlibro(String descripcionlibro) {
		this.descripcionlibro = descripcionlibro;
	}
	public String getCostolibro() {
		return costolibro;
	}
	public void setCostolibro(String costolibro) {
		this.costolibro = costolibro;
	} 
	

}
