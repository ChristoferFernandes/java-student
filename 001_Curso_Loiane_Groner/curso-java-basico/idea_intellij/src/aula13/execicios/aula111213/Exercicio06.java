package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre a área.
 */
public class Exercicio06
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com o valor do raio: ");
		  double raio = tecla.nextDouble();
		  
		  double area = Math.PI * Math.pow(raio,2);
		  System.out.println("A área do raio "+ raio +" é igual a "+ area);
	 }
}
