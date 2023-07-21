package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploAlunos {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Pedro", 2145));
		alunos.add(new Aluno("Hitalo", 7798));
		alunos.add(new Aluno("Joao", 2555));

//		Comparando alunos com method reference
		alunos.sort(Comparator.comparing(Aluno::getNome));

//		Lambda
		alunos.forEach(c -> System.out.println(c.getNome()));

		alunos.stream().filter(c -> c.getNome().length() >= 5).forEach(c -> System.out.println(c.getNome()));
		;

		alunos.stream().filter(c -> c.getNome().length() >= 5).map(c -> c.getNome())
				.forEach(total -> System.out.println(total));
		;
		;
		System.out.println();
		
		Number num = alunos.stream().filter(c -> c.getNome().length() >= 5).map(Aluno::getNome).count();
		
		System.out.println(num);
		
//		Optional = Classe que traz uma opção de um argumento que voce pediu
		
		alunos.stream()
			.filter(c -> c.getMatricula() > 100)
			.findAny().ifPresent(c -> System.out.println(c.getNome()));
		
//		Guardando a variavel em uma Collection
		alunos.stream().filter(c -> c.getMatricula() > 10).collect(Collectors.toList());
		
//		Guardando em um Map (Chave, Valor)
		Map<Number, String> map = alunos.stream().filter(c -> c.getMatricula() > 10).collect(Collectors.toMap(c -> c.getMatricula(), c ->  c.getNome()));
		
		System.out.println(map);
		
//		optionalCurso.ifPresent(c -> System.out.println("Trazendo nome: " + c.getNome()));
		System.out.println();
//		Me devolve um curso, ou SENAO me devolve outra coisa
//		Aluno aluno = optionalCurso.orElse(null);
//		System.out.println(aluno.getNome());
	}
}
