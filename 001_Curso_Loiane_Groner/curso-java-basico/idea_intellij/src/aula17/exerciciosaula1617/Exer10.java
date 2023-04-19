package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//.Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
public class Exer10 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int num1, num2, menorNum, diferenca;
	 
	 System.out.print("Informe um número inteiro: ");
	 num1 = key.nextInt();
	 System.out.print("Informe outro número inteiro: ");
	 num2 = key.nextInt();
	 
	 menorNum = Math.min(num1, num2);
	 diferenca = Math.abs(num1 - num2);
	 
	 for (int i = 1; i < diferenca; i++) {
		System.out.print(menorNum + i + " ");
	 }
  }
}
