package model;

public abstract class Personagem {
			
	private String nome;
	protected double altura;
	private int idade;
	private int estamina;
	private int moedas;
	private int vidas;

	public Personagem(String nome, double altura, int idade) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.estamina = 100;
		this.moedas = 0;
		this.vidas = 1;
	}

	public void saltar() {
		double alturaSalto = this.altura * 0.5;
		System.out.printf(this.nome + " pulou uma altura de: ");
		System.out.printf("%.2f", alturaSalto);
		System.out.printf(" metros!");
		System.out.println();
	}

	public void saltar(double alturaObstaculo) {
		System.out.println(this.nome + " pulou o obstaculo de " + alturaObstaculo + " metros, saltando "
				+ (alturaObstaculo + alturaObstaculo * 0.5) + " metros!");
	}

	public void revigorar() {
		this.estamina = 100;
	}

	public void morrer() {
		this.estamina = 0;
		this.vidas -= 1;

		if (this.vidas <= 0) {
			this.vidas = 0;
			System.out.println("GAME OVER!");
		} else if (this.vidas > 1) {
			revigorar();
		}
		
		System.out.println(this.nome + " você morreu!" + " Vidas: " + this.vidas);
	}

	public void pegarMoeda() {
		this.moedas += 1;
		if (this.moedas % 10 == 0) {
			this.vidas += 1;
		}
	}

	public void informacoes() {
		double alturaAux = this.altura;
		System.out.printf("Personagem: " + this.nome);
		System.out.printf(" | Altura: ");
		System.out.printf("%.2f", alturaAux);
		System.out.println(" | Estamina: " + this.estamina + " | Moedas: " + this.moedas + " | Vidas: " + this.vidas);
		
	}
	public void perderEstamina() {
		this.estamina -= 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}

	public void ganharEstamina() {
		this.estamina += 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}

	public abstract void crescer();

}
