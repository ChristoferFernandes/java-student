package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número.
public class Exer07 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int i;
			double num, resultado;
			
			i = 1;
			resultado = Integer.MIN_VALUE;
			while (i <= 5) {
				 System.out.print("Informe um número: ");
				 num = key.nextDouble();
				 
				 if (num > resultado) {
						resultado = num;
				 }
				 i++;
			}
			System.out.println("O maior número digitado foi: " + (int) resultado);
	 }
}
