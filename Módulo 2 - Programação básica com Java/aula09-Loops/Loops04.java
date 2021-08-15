package aula09;

import java.util.Scanner;

public class Loops04 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero
		 * inteiro entre 1 a 10. O usu�rio deve informar de qual n�mero ele deseja ver a
		 * tabuada. A sa�da deve ser conforme o exemplo abaixo:
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero entre [1-10]: ");
		int num = sc.nextInt();
		
		while (num < 1 || num > 10) {
			System.out.print("Favor, digite um n�mero entre [1-10]: ");
			num = sc.nextInt();
		}
		
		System.out.println("Tabuada do " + num + ":");
		System.out.println();
		
		for (int i = 1; i<=10; i++) {
			int mult = num * i;
			System.out.println(num + " x " + i + " = " + mult);
		}

		sc.close();

	}

}
