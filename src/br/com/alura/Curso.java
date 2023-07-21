package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {
	private int tempoTotal;
	private String nome;
	private String instrutor;
//	Criando uma lista para Aula para ter ArrayList e outras listas como filhas
//	Modificando a saída da lista ou para List, ArrayList ou LinkedList
	private List<Aula> aulas = new ArrayList<Aula>();
//	Cria um mapa com a chave que é inserida para buscar o aluno
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
//	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
//	Não cria a ordem dos alunos
	private Set<Aluno> alunos = new HashSet<>();
	
//	Cria o set com Ordem de criação
//	private Set<Aluno> alunos = new LinkedHashSet<>();
	
//	Faz os set com a ordem natural da classe
//	private Set<Aluno> alunos = new TreeSet<>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
//	Boa prática, devolver uma copia nas referencias ou imutaveis
	public List<Aula> getAulas() {
//		Devolve uma lista parecida com a que é enviada
//		Só que apenas para leitura, não podendo modificar
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo(); 
		}
		return tempoTotal;
	}
	
//	Método do próprio objeto Curso quando é chamado
	public String toString() {
		return "[Curso instrutor: " + nome + "Tempo: " + getTempoTotal() + "Aulas: " + this.aulas + "]";		
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
//		Pegando o mapa e relacionando o numero da matricula com o mesmo aluno
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
//		Apontando para os mesmos objetos mas não modificando os objetos originais
		return Collections.unmodifiableSet(alunos);
	}

//	Confere se um aluno esta dentro do SET
	public boolean estaMatriculado(Aluno a1) {
		// TODO Auto-generated method stub
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
//		Se não contem o numero da matricula ele lança essa excessão
		if(!matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException();
		}
//		Método que busca em cada aluno se existe a matricula pesquisada
		return matriculaParaAluno.get(numeroMatricula);
	}
} 
