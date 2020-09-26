package com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.forum.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
