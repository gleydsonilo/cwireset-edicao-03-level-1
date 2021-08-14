package aula08;

import java.util.Scanner;

public class Condicionais01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que tenha como entradas 4 notas e calcule a média. Ao final
		 * o programa deve apresentar: A mensagem Aluno aprovado, se a média alcançada
		 * for igual ou superior a sete; A mensagem Aluno reprovado, se a média for
		 * inferior a sete; A mensagem Aluno aprovado com louvores, se a média for igual
		 * a dez.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.print("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

		if (media >= 7 && media < 10) {
			System.out.println("Aluno aprovado");
		} else if (media < 7) {
			System.out.println("Aluno reprovado");
		} else if (media == 10) {
			System.out.println("Aluno aprovado com louvores");
		}
		sc.close();
	}
}
