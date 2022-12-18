package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que peça os 3 lados de um triângulo. O programa
 * deverá informar se os valores podem ser um triângulo. Indique, caso
 * os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
 * escaleno.
 * o Dicas:
 * o Três lados formam um triângulo quando a soma de quaisquer
 * dois lados for maior que o terceiro;
 * o Triângulo Equilátero: três lados iguais;
 * o Triângulo Isósceles: quaisquer dois lados iguais;
 * o Triângulo Escaleno: três lados diferentes;
 */
public class Exercicio15
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int lado1;
		  int lado2;
		  int lado3;
		  
		  System.out.print("Informe o 1º lado do triângulo: ");
		  lado1 = tecla.nextInt();
		  
		  System.out.print("Informe o 2º lado do triângulo: ");
		  lado2 = tecla.nextInt();
		  
		  System.out.print("Informe o  3º lado do triângulo: ");
		  lado3 = tecla.nextInt();
		  
		  if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1)
		  {
				System.out.println("Pode formar um TRIÂNGULO.");
				if(lado1 == lado2 && lado1 == lado3)
				{
					 System.out.println("Pode formar um triângulo EQUILATERO");
				}
				else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
				{
					 System.out.println("Pode formar um triângulo ESCALENO");
				}
				else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				{
					 System.out.println("Pode formar um triângulo ISÓCELES");
				}
		  }
		  else
		  {
				System.out.println("NÃO PODE FORMAR UM TRIÂNGULO");
		  }
	 }
}
