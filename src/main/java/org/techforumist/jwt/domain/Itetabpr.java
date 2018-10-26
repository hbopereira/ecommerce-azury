package org.techforumist.jwt.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity

@Table(name = "itetabpr")
public class Itetabpr implements Serializable {

	//@Id
	//@Column
	//private Integer codtabpre;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer codmer;

	@Column
	private Double valven;
	@Column
	private Double porcom;
	@Column
	private Double valpro;

	@OneToOne
	@JoinColumn(name = "codmer")
	private Mercador mercador;
   
	
	//public Mercador getMercador() {
		//return mercador;
	//}

	//public void setMercador(Mercador mercador) {
		//this.mercador = mercador;
	//}

	// public void setCodtabpre(Integer codtabpre) {
	// this.codtabpre = codtabpre;
	// }

	// public Integer getCodtabpre() {
	// return this.codtabpre;
	// }

	//public void setCodmer(Integer codmer) {
//		this.codmer = codmer;
	//}

	//public Integer getCodmer() {
	//	return this.codmer;
	//}

	public void setValven(Double valven) {
		this.valven = valven;
	}

	public Double getValven() {
		return this.valven;
	}

	public void setPorcom(Double porcom) {
		this.porcom = porcom;
	}

	public Double getPorcom() {
		return this.porcom;
	}

	public void setValpro(Double valpro) {
		this.valpro = valpro;
	}

	public Double getValpro() {
		return this.valpro;
	}

	public Integer getCodmer() {
		return codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Mercador getMercador() {
		return mercador;
	}

	public void setMercador(Mercador mercador) {
		this.mercador = mercador;
	}
	
	

//public Integer getCodtabpre() {
	//	return codtabpre;
	//}

	//public void setCodtabpre(Integer codtabpre) {
		//this.codtabpre = codtabpre;
//	}
	

}
