package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número]
 */

import java.util.Scanner;

public class Exer02 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	System.out.print("Informe um número:");
	int valor = key.nextInt();

	System.out.println("O número informado foi " + valor);
  }
}
