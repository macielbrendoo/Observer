package edu.java.observer;

import java.util.ArrayList;

public class SuperInteressante implements Subject {

	private ArrayList<Observer> observer = new ArrayList<>();

	@Override
	public void add(Observer a) {
		observer.add(a);
	}

	@Override
	public void remove(Observer a) {
		observer.remove(a);
	}

	@Override
	public void publicarArtigo(String artigo) {
		for (Observer a : observer) {
			a.receberNoticia(artigo);
		}
	}

}
