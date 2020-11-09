package com.indracompany.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
	@Query("SELECT e FROM Estado e WHERE nome = :nome")
    public List<Estado> findByNome(@Param("nome") String nome);
}
