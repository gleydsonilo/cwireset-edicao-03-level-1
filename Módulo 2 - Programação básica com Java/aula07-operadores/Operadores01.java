package aula07;

import java.util.Scanner;

public class Operadores01 {

	public static void main(String[] args) {
		// Fa�a um programa que tenha como entradas dois n�meros e imprima a soma de
		// ambos. Utilize a classe Scanner para obter as entradas.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num1 = sc.nextInt();

		System.out.print("Digite outro n�mero: ");
		int num2 = sc.nextInt();

		int soma = num1 + num2;

		System.out.println("A soma entre " + num1 + " e " + num2 + " � igual a: " + soma);

		sc.close();
	}

}
