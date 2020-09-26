package com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.service.TopicoService;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoService topicoService;

	@GetMapping
	public List<TopicoDTO> listado(String nombreCurso) {
		return topicoService.listado(nombreCurso);
	}
	
	@PostMapping
	public void registrar(@RequestBody TopicoForm topicoForm) {
		topicoService.registrar(topicoForm);
	}
	
}
