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

	public List<TopicoDTO> listado() {
		List<Topico> resultado = topicoRepository.findAll();
		
		return TopicoDTO.convertir(resultado);
	}
}
