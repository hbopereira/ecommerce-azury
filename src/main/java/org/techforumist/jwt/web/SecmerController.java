package org.techforumist.jwt.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.domain.Secmer;
import org.techforumist.jwt.repository.SecmerRepository;

@RestController
@RequestMapping("/secmer")
public class SecmerController {
	
	@Autowired
	private SecmerRepository secmerRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Secmer> listarSecaoPorMercador(){
		return new ArrayList<Secmer>(secmerRepo.listarSecoesPorMercador());
	}

}
