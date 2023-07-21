package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		pessoas.put(24, "Pedro");
		pessoas.put(17, "Lucas");
		pessoas.put(12, "Bianca");
		pessoas.put(24, "Livia");
		pessoas.put(28, "Tais");
		
//		Fazendo uma iteração por pessoas e recuperando cada uma pelo sua chave, que no caso aqui é a idade
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});

	}

}
