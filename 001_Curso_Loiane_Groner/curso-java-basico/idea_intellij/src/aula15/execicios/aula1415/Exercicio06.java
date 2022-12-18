package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior deles
 */
public class Exercicio06
{
	 public static void main(String[] args)
	 {
		  Scanner key = new Scanner (System.in);
		  
		  double valor;
		  double valor2;
		  double valor3;
		  
		  System.out.print ("Informe o primeiro número: ");
		  valor = key.nextDouble ();
		 
		  System.out.print ("Informe o segundo número: ");
		  valor2 = key.nextDouble ();
		 
		  System.out.print ("Informe o terceiro número: ");
		  valor3 = key.nextDouble ();
		  
		  if (valor > valor2 && valor > valor3)
		  {
				System.out.println (valor + " é o primeiro número e o maior valor digitado.");
		  }
		  else if (valor2 > valor && valor2 > valor3)
		  {
				System.out.println (valor2 + " é o segundo número e o  maior valor digitado.");
		  }
		  else
		  {
				System.out.println (valor3 + " é o terceiro número e o  maior valor digitado.");
		  }
	 }
}
