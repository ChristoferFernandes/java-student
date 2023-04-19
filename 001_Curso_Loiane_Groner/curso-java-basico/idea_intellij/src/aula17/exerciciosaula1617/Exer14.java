package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
public class Exer14 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int par, impar;
	 
	 par = 0;
	 impar = 0;
	 for (int i = 1; i <= 10; i++) {
		System.out.print("Informe o " + i + "º valor: ");
		int valor = key.nextInt();
		
		if (valor % 2 == 0) {
		  par++;
		} else {
		  impar++;
		}
	 }
	 System.out.println("Valores PAR: " + par);
	 System.out.println("Valores IMPAR: " + impar);
  }
}

