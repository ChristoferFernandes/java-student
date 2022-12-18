package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 * Faça um Programa que peça um número e então mostre a mensagem O número
 * informado foi [número].
 */
public class Exercicio02
{
	 public static void main(String[] args)
	 {
		 Scanner tecla = new Scanner(System.in);
		 
		 System.out.print("Informe um número: ");
		 int numero = tecla.nextInt();
		 
		 System.out.println("O número informado foi "+ numero);
	 }
}
