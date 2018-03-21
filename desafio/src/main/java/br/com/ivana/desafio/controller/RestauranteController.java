package br.com.ivana.desafio.controller;


import java.awt.PageAttributes.MediaType;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ivana.desafio.model.Restaurante;

@Controller
public class RestauranteController {

	
	
	
	@RequestMapping(value="/rest", method= RequestMethod.GET)
	public String visualiza() {
		return "restaurante/restaurante.html";		
	}
	
	
	@RequestMapping(value="/rest", method= RequestMethod.POST)
	public String adiciona(Restaurante rest) {
		return "restaurante/restaurante.html";		
	}
}
