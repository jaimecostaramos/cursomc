package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecosta.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	
}
