package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jaimecosta.cursomc.domain.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	
}
