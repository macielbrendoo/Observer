package edu.java.observer;

public class Leitor implements Observer{
	private String nome;
	
	public Leitor(String nome) {
		this.nome = nome;
	}
	@Override
	public void receberNoticia (String noticia) {
		System.out.println("Lendo o artigo: " + noticia);
	}
}
