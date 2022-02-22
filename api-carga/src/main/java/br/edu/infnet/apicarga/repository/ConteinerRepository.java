package br.edu.infnet.apicarga.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apicarga.model.domain.Conteiner;

@Repository
public interface ConteinerRepository extends CrudRepository<Conteiner, Integer> {

	@Query("from Conteiner")
	List<Conteiner> findAll(Sort by);
}
