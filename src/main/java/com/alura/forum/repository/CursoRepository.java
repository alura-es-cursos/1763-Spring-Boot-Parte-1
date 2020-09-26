package com.alura.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Optional<Curso> findByNombre(String nombreCurso);
}
