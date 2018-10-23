package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Mercador;

@Repository
public interface MercadorRepository extends JpaRepository<Mercador, Integer>{

	@Query(value = "select * from mercador " + "left join itetabpr on itetabpr.codmer = mercador.cod "
			+ "where vissit=1 " + "and itetabpr.codtabpre=1" + "order by mercador.des desc ", nativeQuery = true)
	public List<Mercador> listarPorDestaque();

	@Query(value = "select * from mercador limit 10", nativeQuery = true)
	public List<Mercador> listarLimitado();
	
	
	
	

}
