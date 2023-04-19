package src.aula13.execicios.aulas131211;
/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês
 */

import java.util.Scanner;

public class Exer08 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double salarioHora, horasTrabalhadas, salarioTotal;
	 System.out.print("Quanto você ganha por hora? R$: ");
	 salarioHora = key.nextDouble();
	 
	 System.out.print("Quantas horas você trabalha durante o mês? ");
	 horasTrabalhadas = key.nextDouble();
	 
	 salarioTotal = salarioHora * horasTrabalhadas;
	 System.out.println("Baseado nas informações que você nos forneceu, seu salário mensal é de R$" + salarioTotal);
  }
}
