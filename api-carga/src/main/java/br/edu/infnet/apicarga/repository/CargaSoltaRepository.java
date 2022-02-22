package br.edu.infnet.apicarga.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apicarga.model.domain.CargaSolta;

@Repository
public interface CargaSoltaRepository extends CrudRepository<CargaSolta, Integer> {

	@Query("from CargaSolta")
	List<CargaSolta> findAll(Sort by);
}
