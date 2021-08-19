package game;

import java.util.Random;

import model.Personagem;

public class Jogo {

	Personagem jogador1;
	Personagem jogador2;

	public Jogo(Personagem jogador1, Personagem jogador2) {
		super();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	public void imprimirInfo() {
		System.out.println(jogador1);
		System.out.println(jogador2);
	}

	public void jogar() {
		Random random = new Random();
		int valorAleatorio01 = random.nextInt(30);
		
		for (int i = 0; i < valorAleatorio01; i++) {
			jogador1.pegarMoeda();
		}

		int valorAleatorio02 = random.nextInt(30);
		for (int i = 0; i < valorAleatorio02; i++) {
			jogador2.pegarMoeda();
		}

		System.out.println("Quantidade de vezes em que o jogador 1 coletou moedas: " + valorAleatorio01);
		jogador1.informacoes();

		System.out.println("Quantidade de vezes em que o jogador 2 coletou moedas: " + valorAleatorio02);
		jogador2.informacoes();
	}
}
