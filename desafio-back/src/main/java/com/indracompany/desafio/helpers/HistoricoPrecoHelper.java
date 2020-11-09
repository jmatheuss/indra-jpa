package com.indracompany.desafio.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.input.BOMInputStream;

import com.indracompany.desafio.domain.dto.HistoricoPrecoDTO;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class HistoricoPrecoHelper {

	public static Set<HistoricoPrecoDTO> getFromCSV (InputStream csvInputStream) {
		Set<HistoricoPrecoDTO> historicosDePreco = new HashSet<HistoricoPrecoDTO>();
		try (
			Reader reader = new InputStreamReader(new BOMInputStream(csvInputStream), StandardCharsets.UTF_8);
        ) {

            CsvToBean<HistoricoPrecoDTO> csvToBean = new CsvToBeanBuilder<HistoricoPrecoDTO>(reader)
            		.withType(HistoricoPrecoDTO.class)
                    .withSkipLines(1)
                    .withSeparator('\t')
                    .build();

            Iterator<HistoricoPrecoDTO> historicos = csvToBean.iterator();

            while (historicos.hasNext()) {
            	HistoricoPrecoDTO historico = historicos.next();
            	historicosDePreco.add(historico);
                System.out.println("Name : " + historico.getBandeira());
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
			e.printStackTrace();
		}
		return historicosDePreco;
	}
}
