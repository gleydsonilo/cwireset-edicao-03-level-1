package aula09;

import java.util.Scanner;

public class Loops01 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Caso o valor informado
		 * seja inválido, ou seja, não esteja entre zero e dez, mostre uma mensagem
		 * informando o problema, mas mantenha o programa em execução pedindo novamente
		 * a nota até que o usuário informe um valor válido. Quando o usuário informar
		 * uma nota válida, imprima o valor da nota.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma nota entre [0 e 10]: ");
		double nota = sc.nextDouble();

		while (nota < 0 || nota > 10) {
			System.out.print("Atenção: Valor informado inválido. Digite um número entre [0 e 10]: ");
			nota = sc.nextDouble();
		}

		System.out.println("A nota digitada foi: " + nota);
	}
}
