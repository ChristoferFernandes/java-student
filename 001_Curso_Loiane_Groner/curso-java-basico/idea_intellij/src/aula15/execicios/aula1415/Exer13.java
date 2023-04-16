package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.
 */
public class Exer13 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int num;
	System.out.print("Informe um número de 1 a 7: ");
	num = key.nextInt();

	switch (num) {
	  case 1:
		System.out.println("Domingo!");
		break;
	  case 2:
		System.out.println("Segunda-feira!");
		break;
	  case 3:
		System.out.println("Terça-feira!");
		break;
	  case 4:
		System.out.println("Quarta-feira!");
		break;
	  case 5:
		System.out.println("Quinta-feira!");
		break;
	  case 6:
		System.out.println("Sexta-feira!");
		break;
	  case 7:
		System.out.println("Sábado!");
		break;
	  default:
		System.out.println("Valor Inválido!");
	}
  }
}
