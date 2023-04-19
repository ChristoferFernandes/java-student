package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*
Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */
public class Exer13 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int num, num2, potencia;
	 
	 System.out.print("Informe um número inteiro: ");
	 num = key.nextInt();
	 System.out.print("Informe um número para potência: ");
	 num2 = key.nextInt();
	 
	 potencia = 0;
	 for (int i = 1; i < num2; i++) {
		potencia += num * num;
		System.out.println(potencia);
	 }
  }
}
