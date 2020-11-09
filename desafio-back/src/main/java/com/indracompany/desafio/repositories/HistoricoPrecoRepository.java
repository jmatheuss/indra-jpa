package com.indracompany.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.indracompany.desafio.domain.HistoricoPreco;
import com.indracompany.desafio.domain.dto.RelatorioMediaValorDTO;

@Repository
public interface HistoricoPrecoRepository extends JpaRepository<HistoricoPreco, Long>{
	@Query("SELECT AVG(hp.valorVenda) as valor, hp.municipio.nome as descricao FROM HistoricoPreco hp WHERE hp.municipio.nome = :nomeMunicipio GROUP BY hp.municipio.nome ")
    public List<RelatorioMediaValorDTO> findByNomeMunicipio(@Param("nomeMunicipio") String nomeMunicipio);
	
	@Query("SELECT AVG(hp.valorCompra) as valor, hp.municipio.nome as descricao FROM HistoricoPreco hp GROUP BY hp.municipio.nome ")
    public List<RelatorioMediaValorDTO> findMediaValorCompraMunicipio();
	
	@Query("SELECT AVG(hp.valorVenda) as valor, hp.municipio.nome as descricao FROM HistoricoPreco hp GROUP BY hp.municipio.nome ")
    public List<RelatorioMediaValorDTO> findMediaValorVendaMunicipio();
	
	@Query("SELECT AVG(hp.valorCompra) as valor, hp.bandeira as descricao FROM HistoricoPreco hp GROUP BY hp.bandeira ")
    public List<RelatorioMediaValorDTO> findMediaValorCompraBandeira();
	
	@Query("SELECT AVG(hp.valorVenda) as valor, hp.bandeira as descricao FROM HistoricoPreco hp GROUP BY hp.bandeira ")
    public List<RelatorioMediaValorDTO> findMediaValorVendaBandeira();
}
