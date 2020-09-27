package com.alura.forum.controller.validation;

public class FormError {
	
	private String campo;
	
	private String mensaje;
	
	public FormError(String campo, String mensaje) {
		this.campo = campo;
		this.mensaje = mensaje;
	}

	public String getCampo() {
		return campo;
	}

	public String getMensaje() {
		return mensaje;
	}

}
