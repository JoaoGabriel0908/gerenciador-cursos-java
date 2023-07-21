package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Caracteristica do conjunto dos set:
//Não tem garantia da ordem dos objetos
public class TestaAlunos {
	public static void main(String[] args) {
//		Set é filho de Collections
//		Todos os sets não repete o mesmo objeto ou string
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("João Gabriel");
		alunos.add("Pedro Ricardo");
		alunos.add("Flavio Picasso");
		alunos.add("Marios Lucas");
		alunos.add("Sérgio Lopes");
		
//		Verificando se existi esse aluno no Set
		boolean sergioMatriculado = alunos.contains("Sérgio Lopes");
		System.out.println(sergioMatriculado);
		
		System.out.println(alunos);
		
//		Removendo um aluno do set
		alunos.remove("João Gabriel");
		
//		Interando por cada aluno e printando ele na tela
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
//		O construtor de arrayList também recebe coleções
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Set<String> alunosExercicio = new HashSet<>();
		alunosExercicio.add("Fabio");
		alunosExercicio.add("Bianca");
		alunosExercicio.add("Francisco");
		
		System.out.println(alunos.size());
		
		alunosExercicio.add("Bianca");
		
		System.out.println(alunos.size());
		

	}
}
