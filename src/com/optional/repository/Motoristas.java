package com.optional.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.optional.model.Caminhao;
import com.optional.model.Motorista;
import com.optional.model.Seguro;

public class Motoristas {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

	public Motoristas() {

		Seguro seguro = new Seguro("Parcial-> não cobre roubo", new BigDecimal("7000"));
		Caminhao caminhao = new Caminhao("Scania", Optional.ofNullable(seguro));

		Optional motoristaFrancisco = Optional.of(new Motorista("Francisco", 61, Optional.ofNullable(caminhao)));
		Optional motoristaAntonio = Optional.of(new Motorista("Antonio", 34, Optional.ofNullable(null)));

		motoristas.put("Francisco", motoristaFrancisco);
		motoristas.put("Antonio", motoristaAntonio);
	}

	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
}
