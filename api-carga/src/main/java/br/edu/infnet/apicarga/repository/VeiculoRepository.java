package br.edu.infnet.apicarga.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apicarga.model.domain.Veiculo;

@Repository
public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {
	
	@Query("from Veiculo")
	List<Veiculo> findAll(Sort by);

}
