package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */

import java.util.Scanner;

public class Exer11 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int num, num2;
	double num3, resultadoA, resultadoB, resultadoC;

	System.out.print("Informe um número inteiro: ");
	num = key.nextInt();

	System.out.print("Informe outro número inteiro: ");
	num2 = key.nextInt();

	System.out.print("Informe um número real: ");
	num3 = key.nextDouble();

	resultadoA = (num * 2) + ((double) num2 / 2);
	resultadoB = (num * 3) + num3;
	resultadoC = Math.pow(num3, 3);

	System.out.println("O produto do dobro do primeiro com metade do segundo é igual a: " + resultadoA);
	System.out.println("A soma do triplo do primeiro com o terceiro é igual a: " + resultadoB);
	System.out.println("O terceiro elevado ao cubo é igual a: " + resultadoC);
  }
}
