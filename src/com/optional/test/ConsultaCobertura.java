package com.optional.test;

import java.util.Optional;

import com.optional.model.Caminhao;
import com.optional.model.Motorista;
import com.optional.model.Seguro;
import com.optional.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {

		Motoristas motoristas = new Motoristas();
		try {
			String cobertura = motoristas.porNome("Francisco").flatMap(Motorista::getCaminhao)
					.flatMap(Caminhao::getSeguro).map(Seguro::getCobertura).orElse("SEM Seguro");
			System.out.println("Cobertura do seguro é: " + cobertura);
		} catch (Exception e) {

			System.out.println("Motorista NÃO CADASTRADO");

		}

	}

}
