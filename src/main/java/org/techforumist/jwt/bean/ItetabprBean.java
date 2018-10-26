package org.techforumist.jwt.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Itetabpr;
import org.techforumist.jwt.domain.ResumoMercador;
import org.techforumist.jwt.repository.ItetabprRepository;

@Repository
public class ItetabprBean {

	@Autowired
	private ItetabprRepository itetabpr;

	public List<ResumoMercador> retornaConsultaMercadores() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProduto();
		List<ResumoMercador> lista = new ArrayList<ResumoMercador>();

		for (Itetabpr ite : listaitetabpr) {

			ResumoMercador mer = new ResumoMercador();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (ResumoMercador i : lista) {
				existe = i.getCodbar().equals(mer.getCodbar());
				if (existe) {
					if (i.getValvenmax()<mer.getValvenmax()) {
						i.setValvenmax(mer.getValvenmax());
					}
					if (i.getValvenmin()>mer.getValvenmin()) {
						i.setValvenmin(mer.getValvenmin());
					}
					break;
				}
			}
			if (!existe) {
				lista.add(mer);
			}

		}
		return lista;
	}
	
	public List<ResumoMercador> retornaConsultaMercadoresVestido() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoVestido();
		List<ResumoMercador> lista = new ArrayList<ResumoMercador>();

		for (Itetabpr ite : listaitetabpr) {

			ResumoMercador mer = new ResumoMercador();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (ResumoMercador i : lista) {
				existe = i.getCodbar().equals(mer.getCodbar());
				if (existe) {
					if (i.getValvenmax()<mer.getValvenmax()) {
						i.setValvenmax(mer.getValvenmax());
					}
					if (i.getValvenmin()>mer.getValvenmin()) {
						i.setValvenmin(mer.getValvenmin());
					}
					break;
				}
			}
			if (!existe) {
				lista.add(mer);
			}

		}
		return lista;
	}
	
	public List<ResumoMercador> retornaConsultaCigana() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoCigana();
		List<ResumoMercador> lista = new ArrayList<ResumoMercador>();

		for (Itetabpr ite : listaitetabpr) {

			ResumoMercador mer = new ResumoMercador();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (ResumoMercador i : lista) {
				existe = i.getCodbar().equals(mer.getCodbar());
				if (existe) {
					if (i.getValvenmax()<mer.getValvenmax()) {
						i.setValvenmax(mer.getValvenmax());
					}
					if (i.getValvenmin()>mer.getValvenmin()) {
						i.setValvenmin(mer.getValvenmin());
					}
					break;
				}
			}
			if (!existe) {
				lista.add(mer);
			}

		}
		return lista;
	}
	
	public List<ResumoMercador> retornaConsultaCamisete() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoCamisete();
		List<ResumoMercador> lista = new ArrayList<ResumoMercador>();

		for (Itetabpr ite : listaitetabpr) {

			ResumoMercador mer = new ResumoMercador();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (ResumoMercador i : lista) {
				existe = i.getCodbar().equals(mer.getCodbar());
				if (existe) {
					if (i.getValvenmax()<mer.getValvenmax()) {
						i.setValvenmax(mer.getValvenmax());
					}
					if (i.getValvenmin()>mer.getValvenmin()) {
						i.setValvenmin(mer.getValvenmin());
					}
					break;
				}
			}
			if (!existe) {
				lista.add(mer);
			}

		}
		return lista;
	}

}

//mer= xxx
//codbar = 1401160
//valvenmax = 62,90
//valvenmin = 30
