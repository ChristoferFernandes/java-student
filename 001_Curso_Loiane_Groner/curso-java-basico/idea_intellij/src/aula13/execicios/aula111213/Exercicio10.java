package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 *Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em
 graus Farenheit
 FORMULA MATEMATICA °F = (°C x 1,8) + 32
 */
public class Exercicio10
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação da temperatura em Celsius:");
		  double celsius = tecla.nextDouble();
		  
		  double farenheit = (celsius * 1.8) + 32;
		  System.out.println("A conversão para temperatura Farenheit é: "+ farenheit +"Fº");
	 }
}
