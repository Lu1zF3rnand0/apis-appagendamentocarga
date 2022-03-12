package br.edu.infnet.apicarga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apicarga.model.domain.Veiculo;
import br.edu.infnet.apicarga.service.VeiculoService;

@RestController
@RequestMapping("/api/carga")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	
	@PostMapping(value = "/veiculo/incluir")
	public void incluir(@RequestBody Veiculo veiculo) {
		veiculoService.incluir(veiculo);
	}

	@GetMapping(value = "/veiculo/listar")
	public List<Veiculo> obterLista(){
		return veiculoService.obterLista();
	}
	
	@GetMapping(value = "/veiculo/{id}/listarPorUser")
	public List<Veiculo> obterPorUser(@PathVariable Integer id) {
		return veiculoService.obterPorUser(id);
	}

}
