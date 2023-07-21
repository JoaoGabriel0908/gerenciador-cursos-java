package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções de Java", "Paulo Silveira");
		
//		Criando as aulas
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
//		Adicionando aulas
//		javaColecoes.getAulas().add(new Aula("Criando aula", 51));
		
//		Método criado para adicionar aula
		javaColecoes.adiciona(new Aula("Criando aula", 51));
		
//		Não pode modificar a partir do método get
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
//		ArrayList: Mais usado para um for ou forEach
//		Conseguindo inserir e buscar dados mais rápidos
		Aula[] array;
		
//		LinkedList: Mais fácil para adicionar e remover elementos no começo da lista
//		Mas é lenta para buscar elementos de um array
	}
}
