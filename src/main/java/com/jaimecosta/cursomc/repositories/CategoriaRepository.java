package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecosta.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	
}
