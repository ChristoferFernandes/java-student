package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 *  Faça um Programa que peça dois números e imprima a soma.
 */
public class Exercicio03
{
	public static void main(String[] args)
	{
		 Scanner tecla = new Scanner(System.in);
		 
		 System.out.print("Informe um número: ");
		 double valor = tecla.nextDouble();
		 
		 System.out.print("Informe outro número: ");
		 double valor2 = tecla.nextDouble();
		 
		 System.out.println((int)valor+ " + "+ (int)valor2+" = "+ (valor + valor2));
	 }
}
