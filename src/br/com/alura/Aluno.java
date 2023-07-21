package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Aluno {
		
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		if(nome == null) {
			throw new NullPointerException("Não pode ser nulo");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
	}
	
//	Sempre que escrever equals, é obrigado a escrever haschode
//	Reescrevendo o método equals
//	Método que vai verificar se o aluno que ele está procurando esta matriculado
	@Override
	public boolean equals(Object obj) {
//		Adicionando um cast para transformar o obj em aluno
		Aluno a = (Aluno) obj;
		return this.nome.equals(a.nome);
	}
	
//	Método com o numero para cada elemento do SET
	@Override
	public int hashCode() {
//		Devolvendo o código da String nova
		return this.nome.hashCode();
	}
	
}

