package org.techforumist.jwt.domain;

public class ResumoMercador {

	private String codbar;
	private String mer;
	private Double valvenmax;
	private Double valvenmin;

	public String getCodbar() {
		return codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	public String getMer() {
		return mer;
	}

	public void setMer(String mer) {
		this.mer = mer;
	}

	public Double getValvenmax() {
		return valvenmax;
	}

	public void setValvenmax(Double valvenmax) {
		this.valvenmax = valvenmax;
	}

	public Double getValvenmin() {
		return valvenmin;
	}

	public void setValvenmin(Double valvenmin) {
		this.valvenmin = valvenmin;
	}

}
