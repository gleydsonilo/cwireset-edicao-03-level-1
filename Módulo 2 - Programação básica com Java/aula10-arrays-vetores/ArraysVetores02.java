package aula10;

import java.util.Scanner;

public class ArraysVetores02 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia 10 valores inteiros correspondentes as idades de um
		 * grupo de pessoas e armazene em um vetor. Escreva uma lógica para determinar a
		 * quantidade de pessoas que possuem idade igual ou superior a 18 anos. Ao
		 * final, imprima o vetor de idades e a quantidade de pessoas maiores de idade.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int[] idade = new int[10];
		int maiorIdade = 0;

		for (int i = 0; i < idade.length; i++) {
			System.out.print(i + 1 + ") idade: ");
			idade[i] = sc.nextInt();

			if (idade[i] > 18) {
				maiorIdade += 1;
			}
		}

		System.out.println();
		System.out.println("Idades digitadas:");
		for (int x : idade) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Quantidade de pessoas maiores de idade: " + maiorIdade);

		sc.close();
	}

}
