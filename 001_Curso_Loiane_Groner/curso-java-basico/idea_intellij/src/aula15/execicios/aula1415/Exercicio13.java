package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número e exiba o dia correspondente
 * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
 * aparecer valor inválido
 */
public class Exercicio13
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int valor;
		  System.out.print("Informe um número, o número deve ser de 1 até 7: ");
		  valor = tecla.nextInt();
		  
		  switch (valor)
		  {
				case 1:
					 System.out.println("1- Domingo!");
					 break;
				case 2:
					 System.out.println("2- Segunda-feira!");
					 break;
				case 3:
					 System.out.println("3- Terça-feira!");
					 break;
				case 4:
					 System.out.println("4- Quarta-feira!");
					 break;
				case 5:
					 System.out.println("5- Quinta-feira!");
					 break;
				case 6:
					 System.out.println("6- Sexta-feira!");
					 break;
				case 7:
					 System.out.println("7- Sábado!");
					 break;
				default:
					 System.out.println("Opção Inválida!");
		  }
	 }
}
