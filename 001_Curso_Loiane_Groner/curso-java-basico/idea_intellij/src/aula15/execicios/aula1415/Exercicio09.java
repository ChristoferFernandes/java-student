package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
public class Exercicio09
{
	 public static void main(String[] args)
	 {
		  Scanner key = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação do primeiro valor: ");
		  int valor = key.nextInt();
		  
		  System.out.print("Entre com a informação do segundo valor: ");
		  int valor2 = key.nextInt();
		  
		  System.out.print("Entre com a informação do terceiro valor: ");
		  int valor3 = key.nextInt();
		  
		  if (valor <= valor2 && valor <= valor3 && valor2 <= valor3)  //CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 1
		  {
				System.out.println("Contagem regressiva...");
				System.out.println(valor3 +","+ valor2 +","+ valor);
		  }
		  else if (valor <= valor2 && valor <= valor3 && valor3 <= valor2)
		  {
				System.out.println("Contagem regressiva...");
				System.out.println(valor2 +","+ valor3 +","+ valor);
		  }
		  else if (valor2 <= valor && valor2 <= valor3 && valor <= valor3) //CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 2
		  {
				System.out.println("Contagem Regressiva...");
				System.out.println(valor3 +","+ valor +","+ valor2);
		  }
		  else if (valor2 <= valor && valor2 <= valor3 && valor3 <= valor)
		  {
				System.out.println("Contagem Regressiva...");
				System.out.println(valor +","+ valor3 +","+ valor2);
		  }
		  else if (valor3 <= valor && valor3 <= valor2 && valor2 <= valor)	//CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 3
		  {
				System.out.println("Contagem Regressiva...");
				System.out.println(valor2 +","+ valor +","+ valor3);
		  }
		  else if(valor3 <= valor && valor3 <= valor2 && valor <= valor2)
		  {
				System.out.println("Contagem Regressiva...");
				System.out.println(valor2 +","+ valor +","+ valor3);
		  }
	}
}