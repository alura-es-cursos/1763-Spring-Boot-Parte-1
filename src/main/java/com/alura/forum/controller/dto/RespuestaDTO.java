package com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import com.alura.forum.model.Respuesta;

public class RespuestaDTO {

	private Long id;
	
	private String mensaje;
	
	private LocalDateTime fechaCreacion;
	
	private String autor;
	
	public RespuestaDTO(Respuesta respuesta) {
		this.id = respuesta.getId();
		this.mensaje = respuesta.getMensaje();
		this.fechaCreacion = respuesta.getFechaCreacion();
		this.autor = respuesta.getAutor().getNombre();
	}

	public Long getId() {
		return id;
	}

	public String getMensaje() {
		return mensaje;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public String getAutor() {
		return autor;
	}
	
}
