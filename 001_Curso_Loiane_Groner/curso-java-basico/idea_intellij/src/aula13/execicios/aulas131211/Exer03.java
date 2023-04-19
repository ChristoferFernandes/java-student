package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça dois números e imprima a soma
 */

import java.util.Scanner;

public class Exer03 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int valor, valor2;
	 
	 System.out.print("Informe um valor: ");
	 valor = key.nextInt();
	 
	 System.out.print("Informe outro valor: ");
	 valor2 = key.nextInt();
	 
	 System.out.println("A soma de " + valor + " + " + valor2 + " é igual a = " + (valor + valor2));
  }
}
