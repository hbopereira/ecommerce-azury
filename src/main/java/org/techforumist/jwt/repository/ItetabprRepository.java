package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Itetabpr;

@Repository
public interface ItetabprRepository extends JpaRepository<Itetabpr, Integer>{
	
	//@Query(value = "select cod codmer, valven, porcom, valpro from mercador", nativeQuery = true)
	//public List<Itetabpr> ListarPorTabelaDePreco();

	
	@Query(value = "select * from itetabpr " + "left join mercador on itetabpr.codmer = mercador.cod "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "where mercador.vissit=1 " + "and itetabpr.codtabpre=1"
			+ "and itetabpr.codmer = 14738"
			+ "order by mercador.des desc, mercador.mer ", nativeQuery = true)
	public List<Itetabpr> ListarPorTabelaDePreco();
	
	@Query(value = "select * from itetabpr " + "left join mercador on itetabpr.codmer = mercador.cod "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "where mercador.vissit=1 " + "and itetabpr.codtabpre=1"
			+ "and secmer.cod = 6 "
			+ "order by mercador.des desc, mercador.mer ", nativeQuery = true)
    public List<Itetabpr> ListarPorTabelaDePrecoeSecaoVestido();
	
	@Query(value = "select * from itetabpr " + "left join mercador on itetabpr.codmer = mercador.cod "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "where mercador.vissit=1 " + "and itetabpr.codtabpre=1"
			+ "and secmer.cod = 2 "
			+ "order by mercador.des desc, mercador.mer ", nativeQuery = true)
    public List<Itetabpr> ListarPorTabelaDePrecoeSecaoCamisete();
	
	@Query(value = "select * from itetabpr " + "left join mercador on itetabpr.codmer = mercador.cod "
			+ "left join secmer on secmer.cod = mercador.codsecmer "
			+ "where mercador.vissit=1 " + "and itetabpr.codtabpre=1"
			+ "and secmer.cod = 1 "
			+ "order by mercador.des desc, mercador.mer ", nativeQuery = true)
    public List<Itetabpr> ListarPorTabelaDePrecoeSecaoCigana();
	
	


}
