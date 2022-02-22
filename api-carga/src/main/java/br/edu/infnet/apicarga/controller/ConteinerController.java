package br.edu.infnet.apicarga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apicarga.model.domain.Conteiner;
import br.edu.infnet.apicarga.service.ConteinerService;

@RestController
@RequestMapping("/api/carga")
public class ConteinerController {

	@Autowired
	private ConteinerService conteinerService;

	
	@PostMapping(value = "/conteiner/incluir")
	public void incluir(@RequestBody Conteiner conteiner) {
		conteinerService.incluir(conteiner);
	}
	
	@GetMapping(value = "/conteiner/listar")
	public List<Conteiner> obterLista(){
		return conteinerService.obterLista();
	}

}
