package com.alura.forum.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.model.Topico;
import com.alura.forum.service.TopicoService;

@RestController
@RequestMapping("/topicos")
public class TopicosController {
	
	@Autowired
	private TopicoService topicoService;

	@GetMapping
	public ResponseEntity<List<TopicoDTO>> listado(String nombreCurso) {
		return ResponseEntity.ok(topicoService.listado(nombreCurso));
	}
	
	@PostMapping
	public ResponseEntity<TopicoDTO> registrar(@RequestBody TopicoForm topicoForm, UriComponentsBuilder uriComponentsBuilder) {
		Topico topico = topicoService.registrar(topicoForm);
		
		URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new TopicoDTO(topico));
	}
	
}
