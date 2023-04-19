package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
Dica: utilize uma função de arredondamento.
 */
public class Exer23 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			double numero;
			
			System.out.print("Informe um número: ");
			numero = key.nextDouble();
			
			if ((int) numero == numero) {
				 System.out.println((int) numero + " É um número inteiro.");
			} else {
				 System.out.println(numero + " É um número decimal.");
			}
	 }
}
