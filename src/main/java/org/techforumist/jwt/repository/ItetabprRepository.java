package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Itetabpr;
import org.techforumist.jwt.domain.Mercador;




@Repository
public interface ItetabprRepository extends JpaRepository<Itetabpr, Integer>{
	
	
	@Query(value =  "select itetabpr.* " + 
			"from itetabpr " + 
			"left join mercador on mercador.cod = itetabpr.codmer "
			+"left join secmer on secmer.cod = mercador.codsecmer " +
		    "where mercador.vissit = 1 and itetabpr.codtabpre=1  "
		    //+ " and mercador.codsecmer>=:inicio and mercador.codsecmer<=fim "
		    + "" , nativeQuery = true)
	public List<Itetabpr> listarProduto();
	
	@Query(value =  "select itetabpr.* " + 
			"from itetabpr " + 
			"left join mercador on mercador.cod = itetabpr.codmer "
			+"left join secmer on secmer.cod = mercador.codsecmer " +
		    "where mercador.vissit = 1 and itetabpr.codtabpre=1 "
		    +"and secmer.secmer like '%Vestido%' "
		    //+ " and mercador.codsecmer>=:inicio and mercador.codsecmer<=fim "
		    , nativeQuery = true)
	public List<Itetabpr> listarProdutoVestido();
	
	@Query(value =  "select itetabpr.* " + 
			"from itetabpr " + 
			"left join mercador on mercador.cod = itetabpr.codmer "
			+"left join secmer on secmer.cod = mercador.codsecmer " +
		    "where mercador.vissit = 1 and itetabpr.codtabpre=1 "
		    +"and secmer.secmer like '%Camisete%' "
		    //+ " and mercador.codsecmer>=:inicio and mercador.codsecmer<=fim "
		    , nativeQuery = true)
	public List<Itetabpr> listarProdutoCamisete();
	
	
	@Query(value =  "select itetabpr.* " + 
			"from itetabpr " + 
			"left join mercador on mercador.cod = itetabpr.codmer "
			+"left join secmer on secmer.cod = mercador.codsecmer " +
		    "where mercador.vissit = 1 and itetabpr.codtabpre=1 "
		    +"and secmer.secmer like '%Cigana%' "
		    //+ " and mercador.codsecmer>=:inicio and mercador.codsecmer<=fim "
		    , nativeQuery = true)
	public List<Itetabpr> listarProdutoCigana();
	
	
	
	
		
	
	
}
