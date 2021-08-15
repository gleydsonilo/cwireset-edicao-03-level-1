package aula10;

import java.util.Scanner;

public class ArraysVetores01 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que receba 5 valores e armazene em um vetor. Crie um segundo
		 * vetor de mesmo tipo e tamanho, contendo os valores do primeiro vetor
		 * multiplicados por 2. Ou seja: segundoVetor[i] = primeiroVetor[i] * 2. No
		 * final, imprima o conteúdo dos dois vetores.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			System.out.print(i + 1 + ") número: ");
			array1[i] = sc.nextInt();
			array2[i] = array1[i] * 2;
		}

		System.out.println();
		System.out.println("Primeiro array");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		System.out.println();
		System.out.println("Segundo array");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		sc.close();
	}

}
