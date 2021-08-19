package model;

public class Luigi extends Personagem{

	public Luigi(String nome, double altura, int idade) {
		super(nome, altura, idade);
	}

	public void voar() {
		System.out.println("Luigi está voando!");
	}
	
	@Override
	public void crescer() {
		this.altura = this.altura * 1.75;
	}
}
