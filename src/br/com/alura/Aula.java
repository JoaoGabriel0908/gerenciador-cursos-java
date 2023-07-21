package br.com.alura;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.setTitulo(titulo);
		this.setTempo(tempo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
//	Método que vem da herança 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aula: " + this.titulo + this.tempo;
	}

@Override
public int compareTo(Aula o) {
	return this.titulo.compareTo(o.titulo);
}
	
}
