package org.techforumist.jwt.web;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.bean.ItetabprBean;
import org.techforumist.jwt.domain.Itetabpr;
import org.techforumist.jwt.repository.ItetabprRepository;
import org.techforumist.jwt.resumo.MercadorResumo;

@RestController
@RequestMapping("/itens")
public class ItetabprController {

	@Autowired
	private ItetabprRepository itensRepo;
 
	@Autowired
	private ItetabprBean mercadorDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<MercadorResumo> listarTodos() {
	   	return new ArrayList<MercadorResumo>(mercadorDao.retornaConsultaMercadores());
	}

	@RequestMapping(method = RequestMethod.GET, value={"/porVestido"})
	public List<MercadorResumo> listarTodosVestido() {
	   	return new ArrayList<MercadorResumo>(mercadorDao.retornaConsultaMercadoresVestido());
	}
	

	@RequestMapping(method = RequestMethod.GET, value={"/porCamisete"})
	public List<MercadorResumo> listarTodosCamisete() {
	   	return new ArrayList<MercadorResumo>(mercadorDao.retornaConsultaCamisete());
	}
	

	@RequestMapping(method = RequestMethod.GET, value={"/porCigana"})
	public List<MercadorResumo> listarTodosCigana() {
	   	return new ArrayList<MercadorResumo>(mercadorDao.retornaConsultaCigana());
	}
}


