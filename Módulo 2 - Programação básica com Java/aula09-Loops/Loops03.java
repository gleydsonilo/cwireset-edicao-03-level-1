package aula09;

import java.util.Scanner;

public class Loops03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
		 */

		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int num = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ") n�mero: ");
			num = sc.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		System.out.println();
		System.out.println("O maior n�mero informado �: " + maior);

		sc.close();
	}
}