package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que peça um número correspondente a um
 * determinado ano e em seguida informe se este ano é ou não bissexto.
 */
public class Exercicio17
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int ano;
		  System.out.print("Informe que ano quer saber se é bissexto: ");
		  ano = tecla.nextInt();
		  
		  if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
		  {
				System.out.println(ano + " é um ano Bissexto.");
		  }
		  else
		  {
				System.out.println(ano + " não é um ano Bissexto.");
		  }
	 }
}

