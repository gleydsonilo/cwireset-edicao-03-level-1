package aula09;

import java.util.Scanner;

public class Loops03 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia 5 números e informe o maior número.
		 */

		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int num = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ") número: ");
			num = sc.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		System.out.println();
		System.out.println("O maior número informado é: " + maior);

		sc.close();
	}
}