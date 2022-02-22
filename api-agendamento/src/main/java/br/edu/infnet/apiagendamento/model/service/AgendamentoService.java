package br.edu.infnet.apiagendamento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiagendamento.model.domain.Agendamento;
import br.edu.infnet.apiagendamento.model.repository.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;

	public List<Agendamento> obterLista(){
		return agendamentoRepository.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}
	
	public void incluir (Agendamento agendamento) {
		agendamentoRepository.save(agendamento);
	}
	
	public void excluir (Integer id) {
		agendamentoRepository.deleteById(id);
	}
	
}

