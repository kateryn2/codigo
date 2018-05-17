package com.empresa.demo.util;

public class RespuestaRest {

	private Integer respuestaCode;
	private String mensaje;
	
	public RespuestaRest (Integer respuestaCode){
		this.respuestaCode =respuestaCode;
	}
	
	public RespuestaRest (Integer respuestaCode, String mensaje){
		super();
	
		this.respuestaCode =respuestaCode;
		this.mensaje =mensaje;
	}
	
	
	public Integer getRespuestaCode() {
		
		return respuestaCode;
	}
	
	public void setRespuestaCode(Integer respuestaCode) {
		this.respuestaCode = respuestaCode;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
