package com.alura.forum.controller.form;

import java.util.Optional;

import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.model.Usuario;

public class TopicoForm {

	private String titulo;
	
	private String mensaje;
	
	private Long idUsuario;
	
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
