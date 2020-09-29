package com.alura.forum.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forum.controller.dto.DetalleTopicoDTO;
import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.ActualizaTopicoForm;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.model.Usuario;
import com.alura.forum.repository.CursoRepository;
import com.alura.forum.repository.TopicoRepository;
import com.alura.forum.repository.UsuarioRepository;

@Service
public class TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CursoRepository cursoRepository;

	public List<TopicoDTO> listado(String nombreCurso) {
		List<Topico> resultado;
		
		if (nombreCurso == null) {
			resultado = topicoRepository.findAll();
		} else {
			resultado = topicoRepository.findByCursoNombre(nombreCurso);
		}
		
		return TopicoDTO.convertir(resultado);
	}

	public Topico registrar(TopicoForm topicoForm) {
		Optional<Usuario> usuario = usuarioRepository.findById(topicoForm.getIdUsuario());
		Optional<Curso> curso = cursoRepository.findByNombre(topicoForm.getNombreCurso());
		
		Topico topico = topicoForm.convertir(usuario, curso);
		
		return topicoRepository.save(topico);
	}

	public DetalleTopicoDTO detalle(Long id) {
		Topico topico = topicoRepository.getOne(id);
		
		return new DetalleTopicoDTO(topico);
	}

	@Transactional
	public Topico actualizar(Long id, @Valid ActualizaTopicoForm actualizaTopicoForm) {
		Topico topico = topicoRepository.getOne(id);
		topico.setTitulo(actualizaTopicoForm.getTitulo());
		topico.setMensaje(actualizaTopicoForm.getMensaje());
		
		return topico;
	}
	
}
