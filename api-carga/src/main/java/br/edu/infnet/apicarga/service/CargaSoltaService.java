package br.edu.infnet.apicarga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicarga.model.domain.CargaSolta;
import br.edu.infnet.apicarga.repository.CargaSoltaRepository;

@Service
public class CargaSoltaService {
	
	@Autowired
	private CargaSoltaRepository cargaSoltaRepository;
	
	public void incluir(CargaSolta cargaSolta) {
		cargaSoltaRepository.save(cargaSolta);
	}
	
	public List<CargaSolta> obterLista(){
		return cargaSoltaRepository.findAll(Sort.by(Sort.Direction.ASC, "mercadoria"));
	}
	
	public List<CargaSolta> obterPorUser(Integer id) {
		return cargaSoltaRepository.findByUser(id);
	}

}