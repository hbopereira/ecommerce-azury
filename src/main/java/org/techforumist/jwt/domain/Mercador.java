package org.techforumist.jwt.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mercador")
public class Mercador  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod")
	private Integer cod;
	
	//@OneToOne(targetEntity = Secmer.class, fetch = FetchType.EAGER)
	//@Cascade(CascadeType.ALL)
	//@JoinColumn(name = "codsecmer")
	//private Secmer secmer;

	@Column(length=13)
	private String codbar;
	
	@OneToMany(mappedBy = "mercador")
	private List<Itetabpr> itens = new ArrayList<Itetabpr>();
	
/*	@Column(length=4)
	private String codtam;
	
	@Column
	private Short gra;
	*/
	@Column(length=60)
	private String mer;
	
/*	@Column(length=30)
	private String desfor;
	
	@Column(length=13)
	private String codean;
	
	@Column(length=2)
	private String uni;
	
/*	@Column
	private Double vol;
	
	/*@Column
	private Double pesliq;
	
	@Column
	private Double pesbru;*/
	
/*/	@Column
	private Double valcus;
	
	@Column
	private Double valven;
	//@Column
	//private Double marluc;
	/* @Column
	  private Double estatu;*/
	//@Column
	//private Double estmin;
	/*@Column
	  private Double estest;*/
	/*@Column
	/*private Integer codfis;
	@Column
	private Double porcom;
	@Column
	private Double aliicm;
	@Column
	private Integer utides;*/
	@Column
	/*private Integer ativo;
	@Column
	private Integer filtro;
	@Temporal(TemporalType.DATE)
	@Column
	private Date dataltvalcus;
	@Column
	private Integer coddetmer;
	@Column(length=2)
	private String unicom;
	@Column
	private Double fatconuni;
	@Column
	private Integer naoimptab;
	@Column
	private Integer naoimpeti;
	@Column(length=8)
	private String locdep;
	@Column
	private Double indkan;
	@Column(length=15)
	private String ncm;
	@Column
	private Double valcuscal;
	@Column
	private Double pordesmax;
	@Column
	private Double quaref;
	@Temporal(TemporalType.DATE)
	@Column
	private Date datultcot;
	@Column
	private Integer codplacon;
	@Column
	private Short proexp;
	@Column(length=5)
	private String codser;
	//@Lob
	//@Column(columnDefinition = "text")
	//private String obs;
	@Column
	@Type(type = "org.hibernate.type.BinaryType")
	private byte obs[];
	@Column
	private Short vissit;
	@Column
	private Short des;
	@Column(length=100)
	private String palcha;*/
	
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCodbar() {
		return codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	/*public String getCodtam() {
		return codtam;
	}

	public void setCodtam(String codtam) {
		this.codtam = codtam;
	}

	public Short getGra() {
		return gra;
	}

	public void setGra(Short gra) {
		this.gra = gra;
	}*/

	public String getMer() {
		return mer;
	}

	//public void setMer(String mer) {
	//	this.mer = mer;
	//}
     

	//public void setItens(List<Itetabpr> itens) {
	//	this.itens = itens;
	//}
	
	
	
	

/*	public String getDesfor() {
		return desfor;
	}

	public void setDesfor(String desfor) {
		this.desfor = desfor;
	}

	public String getCodean() {
		return codean;
	}

	public void setCodean(String codean) {
		this.codean = codean;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}

/*	public Double getVol() {
		return vol;
	}

	public void setVol(Double vol) {
		this.vol = vol;
	}
*/
/*	public Double getPesliq() {
		return pesliq;
	}

	public void setPesliq(Double pesliq) {
		this.pesliq = pesliq;
	}

	public Double getPesbru() {
		return pesbru;
	}

	public void setPesbru(Double pesbru) {
		this.pesbru = pesbru;
	}
*/
	/*public Double getValcus() {
		return valcus;
	}

	public void setValcus(Double valcus) {
		this.valcus = valcus;
	}

	public Double getValven() {
		return valven;
	}

	public void setValven(Double valven) {
		this.valven = valven;
	}

/*	public Double getMarluc() {
		return marluc;
	}

	public void setMarluc(Double marluc) {
		this.marluc = marluc;
	}

	public Double getEstmin() {
		return estmin;
	}

	public void setEstmin(Double estmin) {
		this.estmin = estmin;
	}

	public Integer getCodfis() {
		return codfis;
	}

	public void setCodfis(Integer codfis) {
		this.codfis = codfis;
	}

	public Double getPorcom() {
		return porcom;
	}

	public void setPorcom(Double porcom) {
		this.porcom = porcom;
	}

	public Double getAliicm() {
		return aliicm;
	}

	public void setAliicm(Double aliicm) {
		this.aliicm = aliicm;
	}

	public Integer getUtides() {
		return utides;
	}

	public void setUtides(Integer utides) {
		this.utides = utides;
	}
*/
	/*public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Integer getFiltro() {
		return filtro;
	}

	public void setFiltro(Integer filtro) {
		this.filtro = filtro;
	}

	public Date getDataltvalcus() {
		return dataltvalcus;
	}

	public void setDataltvalcus(Date dataltvalcus) {
		this.dataltvalcus = dataltvalcus;
	}

	public Integer getCoddetmer() {
		return coddetmer;
	}

	public void setCoddetmer(Integer coddetmer) {
		this.coddetmer = coddetmer;
	}

	public String getUnicom() {
		return unicom;
	}

	public void setUnicom(String unicom) {
		this.unicom = unicom;
	}

	public Double getFatconuni() {
		return fatconuni;
	}

	public void setFatconuni(Double fatconuni) {
		this.fatconuni = fatconuni;
	}

	public Integer getNaoimptab() {
		return naoimptab;
	}

	public void setNaoimptab(Integer naoimptab) {
		this.naoimptab = naoimptab;
	}

	public Integer getNaoimpeti() {
		return naoimpeti;
	}

	public void setNaoimpeti(Integer naoimpeti) {
		this.naoimpeti = naoimpeti;
	}

	public String getLocdep() {
		return locdep;
	}

	public void setLocdep(String locdep) {
		this.locdep = locdep;
	}

	public Double getIndkan() {
		return indkan;
	}

	public void setIndkan(Double indkan) {
		this.indkan = indkan;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public Double getValcuscal() {
		return valcuscal;
	}

	public void setValcuscal(Double valcuscal) {
		this.valcuscal = valcuscal;
	}

	public Double getPordesmax() {
		return pordesmax;
	}

	public void setPordesmax(Double pordesmax) {
		this.pordesmax = pordesmax;
	}

	public Double getQuaref() {
		return quaref;
	}

	public void setQuaref(Double quaref) {
		this.quaref = quaref;
	}

	public Date getDatultcot() {
		return datultcot;
	}

	public void setDatultcot(Date datultcot) {
		this.datultcot = datultcot;
	}

	public Integer getCodplacon() {
		return codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Short getProexp() {
		return proexp;
	}

	public void setProexp(Short proexp) {
		this.proexp = proexp;
	}

	public String getCodser() {
		return codser;
	}

	public void setCodser(String codser) {
		this.codser = codser;
	}

	public byte[] getObs() {
		return obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public Short getVissit() {
		return vissit;
	}

	public void setVissit(Short vissit) {
		this.vissit = vissit;
	}

	public Short getDes() {
		return des;
	}

	public void setDes(Short des) {
		this.des = des;
	}

	public String getPalcha() {
		return palcha;
	}

	public void setPalcha(String palcha) {
		this.palcha = palcha;
	}

	//public Secmer getSecmer() {
	//	return secmer;
	//}

	//public void setSecmer(Secmer secmer) {
	//	this.secmer = secmer;
	//}
	*/
	
	
	

	

}
