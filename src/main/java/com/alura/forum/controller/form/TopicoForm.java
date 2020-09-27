package com.alura.forum.controller.form;

import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.model.Usuario;

public class TopicoForm {

	@NotBlank @Size(min = 5)
	private String titulo;
	
	@NotBlank @Size(min = 5)
	private String mensaje;
	
	@NotNull
	private Long idUsuario;
	
	@NotBlank @Size(min = 5)
	private String nombreCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public  Topico convertir(Optional<Usuario> usuario, Optional<Curso> curso) {
		return new Topico(titulo, mensaje, usuario, curso);
	}
	
}
