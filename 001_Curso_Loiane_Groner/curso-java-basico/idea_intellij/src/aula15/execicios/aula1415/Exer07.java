package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que leia três números e mostre o maior e o menor
deles.
 */
public class Exer07 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double num, num2, num3;
	 
	 System.out.print("Informe o primeiro número: ");
	 num = key.nextDouble();
	 
	 System.out.print("Informe o segundo número: ");
	 num2 = key.nextDouble();
	 
	 System.out.print("Informe o terceiro número: ");
	 num3 = key.nextDouble();
	 
	 if (num > num2 && num > num3) {
		System.out.println(num + " é o maior número digitado");
	 } else if (num2 > num && num2 > num3) {
		System.out.println(num2 + " é o maior número digitado");
	 } else {
		System.out.println(num3 + " é o maior número digitado");
	 }
	 if (num < num2 && num < num3) {
		System.out.println(num + " é o menor número digitado");
	 } else if (num2 < num && num2 < num3) {
		System.out.println(num2 + " é o menor número digitado");
	 } else {
		System.out.println(num3 + " é o menor número digitado");
	 }
  }
}
