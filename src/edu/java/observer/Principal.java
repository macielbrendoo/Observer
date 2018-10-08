package edu.java.observer;

public class Principal {
	public static void main(String[] args) {
		Leitor leitor = new Leitor("João");
		SuperInteressante si = new SuperInteressante();
		
		si.add(leitor);
		
		si.publicarArtigo("FATEC Zona Leste Inicia Provas");
		
	}

}
