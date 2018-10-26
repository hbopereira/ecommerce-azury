package org.techforumist.jwt.web;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.techforumist.jwt.bean.ItetabprBean;
import org.techforumist.jwt.domain.ResumoMercador;

@RestController
@RequestMapping("/resumo")
@Component
public class ResumoMercadorController {
	
	@Autowired
	private ItetabprBean daoMercador;
	
	@GetMapping
	public List<ResumoMercador> listarTodosPorDestaque() throws SQLException{
		return daoMercador.retornaConsultaMercadores();
	}

}
