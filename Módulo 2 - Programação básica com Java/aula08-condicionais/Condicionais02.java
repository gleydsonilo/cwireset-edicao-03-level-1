package aula08;

import java.util.Scanner;

public class Condicionais02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana.
		 * (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que n�o
		 * corresponda � um dia da semana, ent�o deve imprimir a mensagem Valor
		 * inv�lido!.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero entre 1-7: ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Hoje � Domingo!");
		} else if (num == 2) {
			System.out.println("Hoje � Segunda Feira!");
		} else if (num == 3) {
			System.out.println("Hoje � Ter�a Feira!");
		} else if (num == 4) {
			System.out.println("Hoje � Quarta Feira!");
		} else if (num == 5) {
			System.out.println("Hoje � Quinta Feira!");
		} else if (num == 6) {
			System.out.println("Hoje � Sexta Feira!");
		} else if (num == 7) {
			System.out.println("Hoje � Sabado!");
		} else {
			System.out.println("Valor inv�lido!");
		}
		sc.close();
	}
}
