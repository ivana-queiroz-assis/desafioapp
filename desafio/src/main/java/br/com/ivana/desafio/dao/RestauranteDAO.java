package br.com.ivana.desafio.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.ivana.desafio.model.*;

public class RestauranteDAO {

	private static Map<Integer, Restaurante> restaurantes= new HashMap<Integer,Restaurante>();
	
	public void adiciona(Restaurante r) {
		restaurantes.put(r.getId(), r);		
	}
	
}
