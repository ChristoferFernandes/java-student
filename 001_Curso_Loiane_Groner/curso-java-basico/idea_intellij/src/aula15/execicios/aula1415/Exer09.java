package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre-os em ordem
decrescente.
 */
public class Exer09 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int num, num2, num3;

	System.out.print("Informe o primeiro número: ");
	num = key.nextInt();

	System.out.print("Informe o segundo número: ");
	num2 = key.nextInt();

	System.out.print("Informe o terceiro número: ");
	num3 = key.nextInt();

	if (num > num2 && num > num3 && num2 > num3) {
	  System.out.print(num + ", " + num2 + ", " + num3);
	} else if (num2 > num && num2 > num3 && num > num3) {
	  System.out.print(num2 + ", " + num + ", " + num3);
	} else {
	  System.out.print(num3 + ", " + num2 + ", " + num);
	}
  }
}
