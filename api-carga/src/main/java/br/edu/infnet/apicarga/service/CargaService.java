package br.edu.infnet.apicarga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicarga.model.domain.Carga;
import br.edu.infnet.apicarga.repository.CargaRepository;

@Service
public class CargaService {
	
	@Autowired
	private CargaRepository cargaRepository;
	
	public List<Carga> obterLista(){
		return cargaRepository.findAll(Sort.by(Sort.Direction.ASC, "documento"));
	}

	public void excluir(Integer id) {
		cargaRepository.deleteById(id);
	}
	
	public Carga obterPorId(Integer id) {
		return cargaRepository.findById(id).orElse(null);
	}

	public Long obterQtd() {
		return cargaRepository.count();
	}
		
	public void incluir(Carga carga) {
		cargaRepository.save(carga);
	}
	
	public List<Carga> obterPorUser(Integer id) {
		return cargaRepository.findByUser(id);
	}
	
	
}
