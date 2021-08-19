package model;

public class Mario extends Personagem{
	
	private Yoshi yoshi;

	public Mario(String nome, double altura, int idade) {
		super(nome, altura, idade);
	}
	
	public void montarNoYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
	}
	
	public void verificaYoshi() {
		if (yoshi != null) {
			System.out.println("Mario está montado no Yoshi!");
		} else {
			System.out.println("Mario não tem um Yoshi!");
		}
	}

	@Override
	public void crescer() {
		this.altura = (this.altura * 1.5);
	}
	

}
