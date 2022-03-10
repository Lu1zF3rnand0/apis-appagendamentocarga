package br.edu.infnet.apicarga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apicarga.model.domain.Carga;
import br.edu.infnet.apicarga.service.CargaService;

@RestController
@RequestMapping("/api/carga")
public class CargaController {

	@Autowired
	private CargaService cargaService;

	@GetMapping(value = "/listar")
	public List<Carga> obterLista() {
		return cargaService.obterLista();
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		cargaService.excluir(id);
	}
	
	@PostMapping(value = "/incluir")
	public void inserir(@RequestBody Carga carga) {
		cargaService.incluir(carga);
	}

}
