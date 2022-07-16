package com.optional.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.optional.model.Caminhao;
import com.optional.model.Motorista;
import com.optional.model.Seguro;

public class Motoristas {

	private Map<String, Motorista> motoristas = new HashMap<>();

	public Motoristas() {

		Seguro seguro = new Seguro("Parcial-> não cobre roubo", new BigDecimal("7000"));
		Caminhao caminhao = new Caminhao("Scania", seguro);
		Motorista francisco = new Motorista("Francisco", 61, caminhao);
		Motorista antonio = new Motorista("Antonio", 34, null);
		
		motoristas.put("Francisco", francisco);
		motoristas.put("Antonio", null);
		
	}

	public Motorista porNome(String nome) {
		return motoristas.get(nome);
	}
}
