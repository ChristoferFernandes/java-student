package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
o Fatorial de: 5
o 5! = 5 . 4 . 3 . 2 . 1 = 120*/
public class Exer32 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int fatorial, valor;
			System.out.print("Informe um número: ");
			int num = key.nextInt();
			
			System.out.println("Fatorial de: " + num);
			System.out.print("5! = ");
			
			valor = num;
			fatorial = num;
			while (num > 1) {
				 valor--;
				 fatorial = fatorial * valor;
				 System.out.print(num);
				 System.out.print(" . ");
				 num--;
			}
			System.out.println(" 1 = " + fatorial);
	 }
	 
}
