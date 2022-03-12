package br.edu.infnet.apicarga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apicarga.model.domain.CargaSolta;
import br.edu.infnet.apicarga.service.CargaSoltaService;

@RestController
@RequestMapping("/api/carga")
public class CargaSoltaController {
			
	@Autowired
	private CargaSoltaService cargaSoltaService;
	
	@PostMapping(value = "/cargaSolta/incluir")
	public void incluir(@RequestBody CargaSolta cargaSolta ) {
		cargaSoltaService.incluir(cargaSolta);
	}

	@GetMapping(value = "/cargaSolta/listar")
	public List<CargaSolta> obterLista() {
		return cargaSoltaService.obterLista();
	}
	
	@GetMapping(value = "/cargaSolta/{id}/listarPorUser")
	public List<CargaSolta> obterPorUser(@PathVariable Integer id) {
		return cargaSoltaService.obterPorUser(id);
	}
}
