package aula09;

import java.util.Scanner;

public class Loops01 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a uma nota, entre zero e dez. Caso o valor informado
		 * seja inv�lido, ou seja, n�o esteja entre zero e dez, mostre uma mensagem
		 * informando o problema, mas mantenha o programa em execu��o pedindo novamente
		 * a nota at� que o usu�rio informe um valor v�lido. Quando o usu�rio informar
		 * uma nota v�lida, imprima o valor da nota.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe uma nota entre [0 e 10]: ");
		double nota = sc.nextDouble();

		while (nota < 0 || nota > 10) {
			System.out.print("Aten��o: Valor informado inv�lido. Digite um n�mero entre [0 e 10]: ");
			nota = sc.nextDouble();
		}

		System.out.println("A nota digitada foi: " + nota);
	}
}
