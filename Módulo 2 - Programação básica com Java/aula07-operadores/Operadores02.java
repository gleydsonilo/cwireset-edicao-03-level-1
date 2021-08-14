package aula07;

import java.util.Scanner;

public class Operadores02 {

	public static void main(String[] args) {
		// Faça um programa que tenha como entradas 4 notas e imprima a média.
		// Utilize a classe Scanner para obter as entradas.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A media entre " + nota1 + ", " + nota2 + ", " + nota3 + " e " + nota4 + " é igual a: " + media);

		sc.close();
	}

}
