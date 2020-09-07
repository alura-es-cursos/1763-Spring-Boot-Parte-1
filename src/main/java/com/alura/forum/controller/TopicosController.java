package com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.service.TopicoService;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoService topicoService;

	@RequestMapping("/topicos")
	public List<TopicoDTO> listado(String nombreCurso) {
		return topicoService.listado(nombreCurso);
	}

}
