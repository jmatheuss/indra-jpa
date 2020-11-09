package com.indracompany.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.Bandeira;

@Repository
public interface BandeiraRepository extends JpaRepository<Bandeira, Long>{
	
	@Query("SELECT b FROM Bandeira b WHERE descricao = :nomeBandeira")
    public Bandeira findByNome(@Param("nomeBandeira") String nome);
}
