package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Itetabpr;
import org.techforumist.jwt.repository.ItetabprRepository;

@RestController
@RequestMapping("/itens")
public class ItetabprController {

	@Autowired
	private ItetabprRepository itensRepo;

	//@RequestMapping(method = RequestMethod.GET)
	//public List<Itetabpr> listarTodos() {
	//   	return new ArrayList<Itetabpr>(itensRepo.ListarPorTabelaDePreco());
	//}

	@RequestMapping(method = RequestMethod.GET)
	public List<Itetabpr> ListarPorSecaoVestido() {
       return new ArrayList<Itetabpr>(itensRepo.ListarPorTabelaDePrecoeSecaoVestido());
	}
	

	/*@RequestMapping(method = RequestMethod.GET, value={"/porCamisete"})
	public List<Itetabpr> ListarPorSecaoCamisete() {
       return new ArrayList<Itetabpr>(itensRepo.ListarPorTabelaDePrecoeSecaoCamisete());
	}
	

	@RequestMapping(method = RequestMethod.GET, value={"/porCigana"})
	public List<Itetabpr> ListarPorSecaoCigana() {
       return new ArrayList<Itetabpr>(itensRepo.ListarPorTabelaDePrecoeSecaoCigana());
	}*/

}
