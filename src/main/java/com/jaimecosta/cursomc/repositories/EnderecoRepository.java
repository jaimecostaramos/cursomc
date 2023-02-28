package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jaimecosta.cursomc.domain.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
}
