package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
 */

import java.util.Scanner;

public class Exer09 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			double faren, celsius;
			
			System.out.print("Informe quantos graus em Farenheit está fazendo no momento?");
			faren = key.nextDouble();
			
			celsius = (faren - 32) / 1.8;
			System.out.println((int) faren + "Fº é igual a " + (int) celsius + "Cº");
	 }
}
