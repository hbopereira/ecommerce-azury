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
import org.techforumist.jwt.domain.ResumoMercador;
import org.techforumist.jwt.repository.ItetabprRepository;

@RestController
@RequestMapping("/itens")
public class ItetabprController {

	@Autowired
	private ItetabprRepository itensRepo;
 
	@Autowired
	private ItetabprBean mercadorDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ResumoMercador> listarTodos() {
	   	return new ArrayList<ResumoMercador>(mercadorDao.retornaConsultaMercadores());
	}

	@RequestMapping(method = RequestMethod.GET, value={"/porVestido"})
	public List<ResumoMercador> listarTodosVestido() {
	   	return new ArrayList<ResumoMercador>(mercadorDao.retornaConsultaMercadoresVestido());
	}
	

	@RequestMapping(method = RequestMethod.GET, value={"/porCamisete"})
	public List<ResumoMercador> listarTodosCamisete() {
	   	return new ArrayList<ResumoMercador>(mercadorDao.retornaConsultaMercadoresVestido());
	}
	

	@RequestMapping(method = RequestMethod.GET, value={"/porCigana"})
	public List<ResumoMercador> listarTodosCigana() {
	   	return new ArrayList<ResumoMercador>(mercadorDao.retornaConsultaCigana());
	}
}


