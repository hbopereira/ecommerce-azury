package org.techforumist.jwt.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.techforumist.jwt.domain.Itetabpr;
import org.techforumist.jwt.repository.ItetabprRepository;
import org.techforumist.jwt.resumo.MercadorResumo;

@Repository
public class ItetabprBean {

	@Autowired
	private ItetabprRepository itetabpr;

	public List<MercadorResumo> retornaConsultaMercadores() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProduto();
		List<MercadorResumo> lista = new ArrayList<MercadorResumo>();

		for (Itetabpr ite : listaitetabpr) {

			MercadorResumo mer = new MercadorResumo();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setCodTam(ite.getMercador().getCodtam());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (MercadorResumo i : lista) {
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
	
	public List<MercadorResumo> retornaConsultaMercadoresVestido() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoVestido();
		List<MercadorResumo> lista = new ArrayList<MercadorResumo>();

		for (Itetabpr ite : listaitetabpr) {

			MercadorResumo mer = new MercadorResumo();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setCodTam(ite.getMercador().getCodtam());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (MercadorResumo i : lista) {
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
	
	public List<MercadorResumo> retornaConsultaCigana() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoCigana();
		List<MercadorResumo> lista = new ArrayList<MercadorResumo>();

		for (Itetabpr ite : listaitetabpr) {

			MercadorResumo mer = new MercadorResumo();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setCodTam(ite.getMercador().getCodtam());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (MercadorResumo i : lista) {
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
	
	public List<MercadorResumo> retornaConsultaCamisete() {
		List<Itetabpr> listaitetabpr = itetabpr.listarProdutoCamisete();
		List<MercadorResumo> lista = new ArrayList<MercadorResumo>();

		for (Itetabpr ite : listaitetabpr) {

			MercadorResumo mer = new MercadorResumo();
			mer.setCodbar(ite.getMercador().getCodbar());
			mer.setMer(ite.getMercador().getMer());
			mer.setValvenmin(ite.getValven());
			mer.setValvenmax(ite.getValven());
			mer.setCodTam(ite.getMercador().getCodtam());
			mer.setSecmer(ite.getMercador().getSecmer().getSecmer());
			mer.setUrlfoto("app/imagens/"+ite.getMercador().getCodbar().trim()+"_a.jpg");

			boolean existe = false;
			for (MercadorResumo i : lista) {
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
