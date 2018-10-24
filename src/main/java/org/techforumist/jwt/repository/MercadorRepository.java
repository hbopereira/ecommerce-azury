package org.techforumist.jwt.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Mercador;

@Repository
public interface MercadorRepository extends JpaRepository<Mercador, Integer>{

	
//	@Query(value = "select * from mercador " + "left join itetabpr on itetabpr.codmer = mercador.cod "
//			+ "where vissit=1 " + "and itetabpr.codtabpre=1" + "order by mercador.des desc ", nativeQuery = true)
	@Query(value = "select *" + 
			" from mercador "
       + "where mercador.vissit=1 order by mercador.des desc ", nativeQuery = true)
	public List<Mercador> listarPorDestaque();
	

	@Query(value = "select * from mercador limit 10", nativeQuery = true)
	public List<Mercador> listarLimitado();
	
	
/*	@Query(value = "select cod,codbar,codpad,codtam,gra,mer,desfor,codean,codsecmer,codsubsecmer,codmar,uni,vol,pesliq,pesbru,valcus,valven,marluc,estmin,codfis,porcom,aliicm,utides,ativo,filtro,dataltvalcus,coddetmer,unicom,fatconuni,naoimptab,naoimpeti,locdep,indkan,valcuscal,pordesmax,datultcot,codplacon,proexp,codser,codanp,valbascalstret,valicmstret,commin,quaref,ncm,codclafis,codorimer,codtriicm,codsitopesimnac,poripi,codespsubtri,estatu,estest,des,fotcap,obs,palcha,rating,vissit,blo" + 
			" from mercador "
       + "where mercador.vissit=1 order by mercador.des desc ", nativeQuery = true)
	
	*/

}
