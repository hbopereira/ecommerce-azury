package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Secmer;

@Repository
public interface SecmerRepository extends JpaRepository<Secmer, Integer> {

	@Query(value = "select * from secmer where cod in (select codsecmer from mercador) ", nativeQuery = true)
	public List<Secmer> listarSecoesPorMercador();

}
