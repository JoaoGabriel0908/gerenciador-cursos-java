package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist ", 12));
		javaColecoes.adiciona(new Aula("Criando uma aula ", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções ", 9));
		
//		Criando uma lista de aulas do tipo Aula e resgatando somente as aulas do curso
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
//		Criando uma lista de aulas mutaveis que recebe as aulas imutaveis
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		
		System.out.println(aulasImutaveis);
		
//		Exception porque não pode modificar e nem ordenar
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println(javaColecoes.getTempoTotal());
		
		
//		Chamando o método toString
		System.out.println(javaColecoes);
	}

}
