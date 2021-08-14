package aula08;

import java.util.Scanner;

public class Condicionais02 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia um número e exiba o dia correspondente da semana.
		 * (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não
		 * corresponda à um dia da semana, então deve imprimir a mensagem Valor
		 * inválido!.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número entre 1-7: ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("Hoje é Domingo!");
		} else if (num == 2) {
			System.out.println("Hoje é Segunda Feira!");
		} else if (num == 3) {
			System.out.println("Hoje é Terça Feira!");
		} else if (num == 4) {
			System.out.println("Hoje é Quarta Feira!");
		} else if (num == 5) {
			System.out.println("Hoje é Quinta Feira!");
		} else if (num == 6) {
			System.out.println("Hoje é Sexta Feira!");
		} else if (num == 7) {
			System.out.println("Hoje é Sabado!");
		} else {
			System.out.println("Valor inválido!");
		}
		sc.close();
	}
}
