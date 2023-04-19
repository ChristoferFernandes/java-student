package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que peça dois números e imprima o maior deles.
 */
public class Exer01 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int num, num2;
	 
	 System.out.print("Informe um número: ");
	 num = key.nextInt();
	 
	 System.out.print("Informe outro número: ");
	 num2 = key.nextInt();
	 
	 if (num > num2) {
		System.out.println("O maior número informado pelo usuário é " + num);
	 } else {
		System.out.println("O maior número informado pelo usuário é " + num2);
	 }
  }
}
