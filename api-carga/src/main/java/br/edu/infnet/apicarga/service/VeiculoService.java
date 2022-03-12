package br.edu.infnet.apicarga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicarga.model.domain.Veiculo;
import br.edu.infnet.apicarga.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;

	public void incluir(Veiculo veiculo) {
		veiculoRepository.save(veiculo);
	}
	
	public List<Veiculo> obterLista(){
		return veiculoRepository.findAll(Sort.by(Sort.Direction.ASC, "chassi"));
	}
	
	public List<Veiculo> obterPorUser(Integer id) {
		return veiculoRepository.findByUser(id);
	}

}