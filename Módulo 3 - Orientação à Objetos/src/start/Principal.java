package start;

import game.Jogo;
import model.Luigi;
import model.Mario;
import model.Yoshi;

public class Principal {

	public static void main(String[] args) {

		Mario mario = new Mario("Mario", 1.60, 40);
		Luigi luigi = new Luigi("Luigi", 1.80, 37);
		Yoshi yoshi = new Yoshi("Yoshi", 0.85, 94);
		
		Jogo jogo = new Jogo(mario, luigi);
		
		jogo.jogar();
		
		mario.verificaYoshi();
		mario.montarNoYoshi(yoshi);
		mario.verificaYoshi();
		mario.saltar();
		mario.crescer();
		mario.morrer();
		mario.morrer();
	}

}