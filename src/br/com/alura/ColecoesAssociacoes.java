package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ColecoesAssociacoes {

	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Pedro", 24);
		nomesParaIdade.put("Lucas", 36);
		nomesParaIdade.put("Bianca", 23);
		nomesParaIdade.put("Livia", 16);
		nomesParaIdade.put("Tais", 62);
	
//		Acessando coleções de chaves
		System.out.println("Acessando as coleções de chaves(key)");
		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}
		System.out.println(chaves);
		System.out.println();
		
//		Acessando as coleções de valores
		System.out.println("Acessando as coleções de valores");
		for (String idade : chaves) {
			System.out.println(idade);
		}
		System.out.println();

//		Acessando as coleções de associacoes
//		Cada associação é representado pela classe Entry
		System.out.println("Acessando as coleções de associação");
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
	}
}
