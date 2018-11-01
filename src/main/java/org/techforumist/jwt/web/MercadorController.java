package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Mercador;
import org.techforumist.jwt.repository.MercadorRepository;
import org.techforumist.jwt.resumo.MercadorResumido;

@RestController
@RequestMapping("/mercador")
public class MercadorController {
	
	@Autowired
	private MercadorRepository mercadorRepo;
	
	@RequestMapping(value = "/listaMercadorResumidoComParametroSecao", method = RequestMethod.GET)
	public List<MercadorResumido> buscarProdutoPorSecaoComParametro(String secmer){
		return new ArrayList<MercadorResumido>(mercadorRepo.listarPorDestaqueESecao(secmer));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<MercadorResumido> buscarProdutoPorSecao(){
		return new ArrayList<MercadorResumido>(mercadorRepo.listarPorDestaque());
	}
	
	
}

