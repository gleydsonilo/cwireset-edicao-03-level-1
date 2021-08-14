package aula07;

import java.util.Scanner;

public class Operadores01 {

	public static void main(String[] args) {
		// Faça um programa que tenha como entradas dois números e imprima a soma de
		// ambos. Utilize a classe Scanner para obter as entradas.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num1 = sc.nextInt();

		System.out.print("Digite outro número: ");
		int num2 = sc.nextInt();

		int soma = num1 + num2;

		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a: " + soma);

		sc.close();
	}

}
