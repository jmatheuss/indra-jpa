package com.indracompany.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long>{
	@Query("SELECT m FROM Municipio m WHERE descricao = :nomeMunicipio")
    public Municipio findByNome(@Param("nomeMunicipio") String nome);
}
