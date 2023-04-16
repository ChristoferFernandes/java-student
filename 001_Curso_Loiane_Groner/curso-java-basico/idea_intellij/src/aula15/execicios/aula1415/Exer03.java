package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
 */
public class Exer03 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	System.out.print("Digite a letra \"F\" ou \"M\": ");
	String sexo = key.nextLine();

	if (sexo.equalsIgnoreCase("F")) {
	  System.out.println("F - Feminino.");
	} else if (sexo.equalsIgnoreCase("M")) {
	  System.out.println("M - Masculino.");
	} else {
	  System.out.println("Sexo inválido.");
	}
  }
}
