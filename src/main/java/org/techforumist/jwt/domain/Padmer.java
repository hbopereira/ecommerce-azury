package org.techforumist.jwt.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@SuppressWarnings("serial")
@Entity
@Table(name = "padmer")
public class Padmer implements Serializable {

	@Id
	@Column(length = 6)
	private String cod;
	@Column(length = 20)
	private String padmer;
	@Column
	private Integer ativo;

	@OneToMany(mappedBy = "padmer", fetch=FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private List<Mercador> mercador;

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getCod() {
		return this.cod;
	}

	public void setPadmer(String padmer) {
		this.padmer = padmer;
	}

	public String getPadmer() {
		return this.padmer;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	/*
	 * public List<Mercador> getMercador() { return mercador; }
	 * 
	 * public void setMercador(List<Mercador> mercador) { this.mercador = mercador;
	 * }
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.cod.compareToIgnoreCase(((Padmer) obj).cod) == 0;
	}

}
