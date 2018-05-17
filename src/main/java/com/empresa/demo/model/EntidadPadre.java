package com.empresa.demo.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Access(AccessType.FIELD)
public class EntidadPadre implements Serializable {

	private static final long serialVersionUID = 8320246411646322053L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro", unique=true, nullable= false)
	private Long idLibro;

	public Long getId() {
		return idLibro;
	}

	public void setId(Long idLibro) {
		this.idLibro = idLibro;
	}
}
