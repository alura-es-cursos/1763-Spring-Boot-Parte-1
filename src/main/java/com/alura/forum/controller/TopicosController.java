package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDTO> listado() {
		Topico topico = new Topico("Título del tópico", "Mensaje del tópico", new Curso("Spring Boot Parte 1", "Desarrollo"));
		Topico topico2 = new Topico("Título del tópico 2", "Mensaje del tópico 2", new Curso("Spring Boot Parte 1", "Desarrollo"));
		
		return TopicoDTO.convertir(Arrays.asList(topico, topico2));
	}

}
