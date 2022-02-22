package br.edu.infnet.apiagendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apiagendamento.model.domain.Agendamento;
import br.edu.infnet.apiagendamento.model.service.AgendamentoService;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {
	
	@Autowired
	private AgendamentoService agendamentoService;

	
	@GetMapping(value = "/listar")
	public List<Agendamento> obterlista() {
		return agendamentoService.obterLista();
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir (@PathVariable Integer id) {
		agendamentoService.excluir(id);
	}

	@PostMapping(value = "/incluir")
	public void incluir (@RequestBody Agendamento agendamento) {
		agendamentoService.incluir(agendamento);
	}

}
