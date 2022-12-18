package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 *  Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
public class Exercicio02
{
	public static void main(String[] args) {
  		Scanner key = new Scanner(System.in);
		
		double valor;
		
  		System.out.print("Entre com a informação de um valor: ");
  		valor = key.nextDouble();
  
  		if(valor >= 0)
		{
			 System.out.println (valor + " é um número positivo.");
		}
		else
		{
	 		System.out.println(valor +" é um número negativo.");
  		}
	}
}
