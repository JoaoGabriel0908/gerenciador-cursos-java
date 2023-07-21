package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adiciona(new Aula("Trabalhando com Arraylist ", 12));
		javaColecoes.adiciona(new Aula("Criando uma aula ", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções ", 9));
		
		Aluno a1 = new Aluno("João Gabriel", 12);
		Aluno a2 = new Aluno("Fabio Pedro", 26);
		Aluno a3 = new Aluno("Lucas Gabriel", 25);
		Aluno a4 = new Aluno("Juan Felipe", 43);
		
//		Matriculando os alunos no curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
//		javaColecoes.getAlunos().forEach(alu -> {
//			System.out.println(alu);
//		});
		
//		Todas as coleções possuem extensão o Iterator
		Set<Aluno> aluno = javaColecoes.getAlunos();
		Iterator<Aluno> iterador =  aluno.iterator();
//		Pergunta se tem um próximo elemento?
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		Erro pois ele percorreu todos os alunos usando o iterador
		Aluno alunoDepoisDoUltimo = iterador.next();
		
		System.out.println("O aluno " + a1 + "Está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno joao = new Aluno("João Gabriel", 12);
		String nome = "João Gabriel";
		System.out.println("João está matriculado?");
		System.out.println(a1.equals(joao));
		
//		Obrigatoriamente quando temos o método equals 
//		Já que eles são "EQUALS", será o mesmo número no identificador 
		System.out.println(a1.hashCode() == joao.hashCode());
	}
}
