package br.edu.infnet.apicliente.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apicliente.model.domain.Cliente;
import br.edu.infnet.apicliente.model.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public Long obterQtde() {
		return clienteRepository.count();
	}

	public List<Cliente> obterLista() {
		return clienteRepository.findAll();
	}

	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

}