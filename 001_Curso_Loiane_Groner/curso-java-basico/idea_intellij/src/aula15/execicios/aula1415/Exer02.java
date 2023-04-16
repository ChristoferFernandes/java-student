package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo
 */
public class Exer02 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	System.out.print("Informe um número: ");
	int num = key.nextInt();

	if (num >= 0) {
	  System.out.println(num + " é um número positivo.");
	} else {
	  System.out.println(num + " é um número negativo.");
	}
  }
}
