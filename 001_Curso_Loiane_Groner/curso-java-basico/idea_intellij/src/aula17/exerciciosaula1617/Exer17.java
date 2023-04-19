package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */
public class Exer17 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			long fatorial, valor;
			int num;
			
			System.out.print("Entre com a informação de um número: ");
			num = key.nextInt();
			
			System.out.print("Fatorial de " + num + "! = ");
			
			valor = num;
			fatorial = num;
			while (num > 1) {
				 System.out.print(num + " ");
				 valor--;
				 fatorial = fatorial * valor;
				 num--;
			}
			System.out.print(" 1 = " + fatorial);
	 }
}

