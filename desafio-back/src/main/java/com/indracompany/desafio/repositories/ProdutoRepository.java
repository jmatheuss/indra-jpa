package com.indracompany.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	@Query("SELECT p FROM Produto p WHERE descricao = :nome")
    public Produto findByNome(@Param("nome") String nome);
}
