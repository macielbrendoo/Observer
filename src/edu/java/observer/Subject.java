package edu.java.observer;

public interface Subject {
	
	void add(Observer a);
	void remove (Observer a);
	void publicarArtigo(String noticia);

}
