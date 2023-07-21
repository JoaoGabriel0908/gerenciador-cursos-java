package br.com.alura;

public class TestaBuscaAlunosDoCurso {	
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
		
		System.out.println("Quem é o aluno com a matricula igual a 25?");
		Aluno aluno = javaColecoes.buscaMatriculado(5);
		System.out.println("aluno: " + aluno);
	}
}
