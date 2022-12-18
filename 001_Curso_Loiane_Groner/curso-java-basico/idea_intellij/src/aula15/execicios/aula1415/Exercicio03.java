package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
 */
public class Exercicio03
{
	 public static void main(String[] args)
	 {
		  Scanner key = new Scanner(System.in);
		  
		  System.out.print("Informe \"F\"ou \"M\": ");
		  String sexo = key.next();
		  
		  if (sexo.equalsIgnoreCase("f"))
		  {
				System.out.println("F - FEMININO.");
		  }
		  else if(sexo.equalsIgnoreCase("m"))
		  {
				System.out.println("M - MASCULINO.");
		  }
		  else
		  {
				System.out.println("Sexo inválido.");
		  }
	 }
}
