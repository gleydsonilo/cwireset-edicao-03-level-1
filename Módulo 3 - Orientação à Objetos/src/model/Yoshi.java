package model;

public class Yoshi extends Personagem{

	private int frutas;
	private int velocidade;
	
	public Yoshi(String nome, double altura, int idade) {
		super(nome, altura, idade);
		this.frutas = 0;
		this.velocidade = 10;
		
	}
	
	public void comerFruta() {
		System.out.println("Comendo uma Fruta!");
		this.frutas += 1;
		if (this.frutas % 2 == 0) {
			this.velocidade *= 2;
		}
	}

	public int getVelocidade() {
		return velocidade;
	}
	
	@Override
	public void crescer() {
		this.altura = this.altura * 1.1;
	}
	
	
}
