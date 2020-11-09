package com.indracompany.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.UnidadeMedida;

@Repository
public interface UnidadeMedidaRepository extends JpaRepository<UnidadeMedida, Long>{
	@Query("SELECT u FROM UnidadeMedida u WHERE descricao = :nome")
    public UnidadeMedida findByNome(@Param("nome") String nome);
}
