package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecosta.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	
}
