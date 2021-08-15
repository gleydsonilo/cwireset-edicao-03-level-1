package aula09;

import java.util.Scanner;

public class Loops02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia dois números e imprima todos os valores presentes
		 * no intervalo entre eles, um abaixo do outro. Caso o segundo número seja menor
		 * ou igual ao primeiro, solicite um novo número até que o segundo número seja
		 * maior que o primeiro.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números, sendo o primeiro MENOR que o segundo!");

		System.out.print("Primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Segundo número: ");
		int num2 = sc.nextInt();

		while (num1 > num2) {
			System.out.println("É necessário que o primeiro seja MENOR que o segundo!");
			System.out.println("Favor digite novamente!");

			System.out.print("Primeiro número: ");
			num1 = sc.nextInt();

			System.out.print("Segundo número: ");
			num2 = sc.nextInt();
		}

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

		sc.close();
	}
}
