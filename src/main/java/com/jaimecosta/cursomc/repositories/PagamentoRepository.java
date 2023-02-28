package com.jaimecosta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecosta.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

	
}
