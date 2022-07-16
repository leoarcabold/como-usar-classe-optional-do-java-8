package com.optional.test;

import com.optional.model.Motorista;
import com.optional.repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {

		Motoristas motoristas = new Motoristas();
		
		Motorista motorista = motoristas.porNome("Antonio");
		
		String cobertura = motorista.getCaminhao().getSeguro().getCobertura();

		System.out.println(cobertura);
	}
<<<<<<< HEAD
	
=======
>>>>>>> e677832 (commit solucao com NullPintException)

}
