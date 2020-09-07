package com.alura.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.model.Topico;
import com.alura.forum.repository.TopicoRepository;

@Service
public class TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;

	public List<TopicoDTO> listado(String nombreCurso) {
		List<Topico> resultado;
		
		if (nombreCurso == null) {
			resultado = topicoRepository.findAll();
		} else {
			resultado = topicoRepository.findByCursoNombre(nombreCurso);
		}
		
		return TopicoDTO.convertir(resultado);
	}
}
