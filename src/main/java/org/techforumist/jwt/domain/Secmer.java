package org.techforumist.jwt.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@SuppressWarnings("serial")
@Entity
@Table(name = "secmer")
public class Secmer implements Serializable {
	@Id
	@Column
	@SequenceGenerator(name = "autoincCodSecmer", sequenceName = "sequenceCodSecmer")
	@GeneratedValue(generator = "autoincCodSecmer")
	private Integer cod;
	@Column(length = 30)
	private String secmer;
	@Column
	private Short tip;
	@Column
	private Integer ativo;

	// @OneToMany(mappedBy="secmer",fetch=FetchType.EAGER)
	// @Cascade(CascadeType.ALL)
	// @Fetch(FetchMode.SELECT)
	// private List<Mercador> mercador;

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (obj.getClass() == this.getClass()) {

			return this.cod == ((Secmer) obj).getCod();

		} else
			return false;

	}

	public void setSecmer(String secmer) {
		this.secmer = secmer;
	}

	public String getSecmer() {
		return this.secmer;
	}

	public void setTip(Short tip) {
		this.tip = tip;
	}

	public Short getTip() {
		return this.tip;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

//public List<Mercador> getMercador() {
//	return mercador;
//}

//public void setMercador(List<Mercador> mercador) {
//	this.mercador = mercador;
//}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

}
