package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
 desta área para o usuario.
 */
public class Exercicio07
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação do tamanho do lado do quadrado: ");
		  int baseQuadrado = tecla.nextInt();
		  
		  double area = Math.pow(baseQuadrado,2);
		  area = area * 2;
		  System.out.println("O dobro da área do quadrado é igual a "+ (int)area +"m²");
	 }
}
