package br.edu.infnet.apicarga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicarga.model.domain.Conteiner;
import br.edu.infnet.apicarga.repository.ConteinerRepository;

@Service
public class ConteinerService {
	
	@Autowired
	private ConteinerRepository conteinerRepository;

	public void incluir(Conteiner conteiner) {
		conteinerRepository.save(conteiner);
	}
	
	public List<Conteiner> obterLista(){
		return conteinerRepository.findAll(Sort.by(Sort.Direction.ASC, "numero"));
	}
	
	
	
}