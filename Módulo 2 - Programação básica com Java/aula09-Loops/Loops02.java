package aula09;

import java.util.Scanner;

public class Loops02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que leia dois n�meros e imprima todos os valores presentes
		 * no intervalo entre eles, um abaixo do outro. Caso o segundo n�mero seja menor
		 * ou igual ao primeiro, solicite um novo n�mero at� que o segundo n�mero seja
		 * maior que o primeiro.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois n�meros, sendo o primeiro MENOR que o segundo!");

		System.out.print("Primeiro n�mero: ");
		int num1 = sc.nextInt();

		System.out.print("Segundo n�mero: ");
		int num2 = sc.nextInt();

		while (num1 > num2) {
			System.out.println("� necess�rio que o primeiro seja MENOR que o segundo!");
			System.out.println("Favor digite novamente!");

			System.out.print("Primeiro n�mero: ");
			num1 = sc.nextInt();

			System.out.print("Segundo n�mero: ");
			num2 = sc.nextInt();
		}

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

		sc.close();
	}
}
