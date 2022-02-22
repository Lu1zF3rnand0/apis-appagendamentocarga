package br.edu.infnet.apicarga.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apicarga.model.domain.Carga;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Integer> {

	@Query("from Carga")
	List<Carga> findAll(Sort by);

}
