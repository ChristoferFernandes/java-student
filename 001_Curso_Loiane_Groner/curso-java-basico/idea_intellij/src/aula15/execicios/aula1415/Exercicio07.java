package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 */

public class Exercicio07
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
			
		  double valor;
		  double valor2;
		  double valor3;
		  double maiorValor;
		  double menorValor;
		  
		  System.out.print("Informe o primeiro número: ");
		  valor = tecla.nextDouble();
		 
		  System.out.print("Informe o segundo número: ");
		  valor2 = tecla.nextDouble();
		 
		  System.out.print("Informe o terceiro número: ");
		  valor3 = tecla.nextDouble();
		  
		  if (valor > valor2 && valor > valor3) // ACHANDO O MAIOR VALOR
		  {
				maiorValor = valor;
		  }
		  else if (valor2 > valor && valor2 > valor3)
		  {
				maiorValor = valor2;
		  }
		  else
		  {
				maiorValor = valor3;
		  }
		  if (valor < valor2 && valor < valor3) // ACHANDO O MENOR VALOR
		  {
				menorValor = valor;
		  }
		  else if (valor2 < valor && valor2 < valor3)
		  {
				menorValor = valor2;
		  }
		  else
		  {
				menorValor = valor3;
		  }
		  System.out.println (maiorValor +" É o maior número informado pelo usuário.");
		  System.out.println (menorValor +" É o menor número informado pelo usuário.");
	 }
}
