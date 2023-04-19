package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
.Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
Dica: utilize o operador módulo (resto da divisão).

 */
public class Exer22 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int numero;
			
			System.out.print("Informe um número: ");
			numero = key.nextInt();
			
			if (numero % 2 == 1) {
				 System.out.println(numero + " é um número IMPAR.");
			} else {
				 System.out.println(numero + " é um número PAR.");
			}
	 }
}
