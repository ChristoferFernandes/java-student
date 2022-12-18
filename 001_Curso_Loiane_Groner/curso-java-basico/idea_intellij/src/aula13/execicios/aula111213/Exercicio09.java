package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
 temperatura em graus Celsius.
 FORMULA MATEMATICA: C = (5 * (F-32) / 9)
 */
public class Exercicio09
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação da temperatura em Fahrenheit: ");
		  double fahrenheit = tecla.nextDouble();
		  
		  double celsius = (fahrenheit - 32) / 1.8;
		  System.out.println("A conversão para temperatura Celsius é: "+ (int)celsius +"Cº");
	 }
}
