package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jaimecosta.cursomc.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	
}
