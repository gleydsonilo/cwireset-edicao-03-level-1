package aula07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operadores03 {

	public static void main(String[] args) {
		// Fa�a um programa que solicite quanto voc� ganha por hora 
		// e o n�mero de horas trabalhadas no m�s. Calcule e mostre 
		// o total do seu sal�rio no referido m�s.

		Scanner sc = new Scanner(System.in);
		
		DecimalFormat decimal = new DecimalFormat("###,###,###,##0.00");

		System.out.print("Quanto voc� ganhar por hora: ");
		double valorHora = sc.nextDouble();

		System.out.print("Quantas horas foram trabalhadas no m�s:  ");
		double qtdHoras = sc.nextDouble();

		double salario = valorHora * qtdHoras;

		System.out.println("O total do sal�rio no m�s �: R$ " + decimal.format(salario));

		sc.close();
		
	}

}
