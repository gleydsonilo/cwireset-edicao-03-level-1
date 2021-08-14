package aula07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operadores03 {

	public static void main(String[] args) {
		// Faça um programa que solicite quanto você ganha por hora 
		// e o número de horas trabalhadas no mês. Calcule e mostre 
		// o total do seu salário no referido mês.

		Scanner sc = new Scanner(System.in);
		
		DecimalFormat decimal = new DecimalFormat("###,###,###,##0.00");

		System.out.print("Quanto você ganhar por hora: ");
		double valorHora = sc.nextDouble();

		System.out.print("Quantas horas foram trabalhadas no mês:  ");
		double qtdHoras = sc.nextDouble();

		double salario = valorHora * qtdHoras;

		System.out.println("O total do salário no mês é: R$ " + decimal.format(salario));

		sc.close();
		
	}

}
