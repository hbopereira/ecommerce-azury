package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Mercador;
import org.techforumist.jwt.resumo.MercadorResumido;

@Repository
public interface MercadorRepository extends JpaRepository<Mercador, Integer>{

	
	//@Query(value = "select * from mercador "
		//	+ "where codsecmer = :codsecmer", nativeQuery = true)
	//public List<Mercador> listarPorDestaque(@Param("codsecmer") Integer codsecmer);  quando passo um parametro tipo inteiro retorna erro.
	
	@Query(value = "select "
			+ "mercador.codbar, mercador.mer, "
			+ "max(itetabpr.valven)ValVenMax, min(itetabpr.valven)ValVenMin "
			+ "from mercador "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "left join itetabpr on itetabpr.codmer = mercador.cod and itetabpr.codtabpre=1 and mercador.vissit=1"
			+ "where secmer.secmer =:secmer "
			+ "group by mercador.codbar, mercador.mer ", nativeQuery = true)
	public List<MercadorResumido> listarPorDestaqueESecao(@Param("secmer") String secmer); 
	
	@Query(value = "select "
			+ "mercador.codbar, mercador.mer, "
			+ "max(itetabpr.valven)ValVenMax, min(itetabpr.valven)ValVenMin "
			+ "from mercador "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "left join itetabpr on itetabpr.codmer = mercador.cod and itetabpr.codtabpre=1 and mercador.vissit=1"
			+ "group by mercador.codbar, mercador.mer ", nativeQuery = true)
	public List<MercadorResumido> listarPorDestaque(); 
	
	
	
	

}
