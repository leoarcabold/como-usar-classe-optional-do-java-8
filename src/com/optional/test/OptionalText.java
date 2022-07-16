package com.optional.test;

import java.math.BigDecimal;
import java.util.Optional;

import com.optional.model.Seguro;

public class OptionalText {

	public static void main(String[] args) {

		Seguro seguro = new Seguro("Franquia reduzida", new BigDecimal("580"));

		Optional<Seguro> seguroOpcional = Optional.ofNullable(seguro);

		seguroOpcional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
	}
}
