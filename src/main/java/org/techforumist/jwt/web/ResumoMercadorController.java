package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Mercador;
import org.techforumist.jwt.repository.MercadorRepository;

@RestController
@RequestMapping("/resumo")
public class ResumoMercadorController {
   
	@Autowired
	private MercadorRepository repoMercador;
	
	@GetMapping
	public List<Mercador> listarTodosPorDestaque(){
		return new ArrayList<Mercador>(repoMercador.listarPorDestaque());
	}

}
