package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 Faça um programa que pergunte o preço de três produtos e informe qual produto voce
 deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
public class Exercicio08
{
	 public static void main(String[] args)
	 {
		  Scanner key = new Scanner(System.in);
		  
		  double valor;
		  double valor2;
		  double valor3;
		  
		  System.out.print("Informe o valor do primeiro produto: ");
		  valor = key.nextDouble();
		  
		  System.out.print("Informe o valor do segundo produto: ");
		  valor2 = key.nextDouble();
		  
		  System.out.print("Informe o valor do terceiro produto: ");
		  valor3 = key.nextDouble();
		  
		  if(valor < valor2 && valor < valor3)
		  {
				System.out.println("Você deve comprar o 1º produto, é o mais barato.");
		  }
		  else if(valor2 < valor && valor2 < valor3)
		  {
				System.out.println("Você deve comprar o 2º produto, é o mais barato.");
		  }
		  else
		  {
				System.out.println("Você deve comprar o 3º produto, é o mais barato.");
		  }
	 }
}
