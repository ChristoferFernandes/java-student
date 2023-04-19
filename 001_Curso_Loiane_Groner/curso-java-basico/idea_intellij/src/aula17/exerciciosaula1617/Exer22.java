package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível. */
public class Exer22 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int num;
			boolean primo;
			System.out.print("Entre com a informação de um valor: ");
			num = key.nextInt();
			
			primo = true;
			for (int i = 2; i < num; i++) {
				 if (num % i == 0) {
						System.out.println("Não é um número PRIMO. ");
						System.out.println("É divisível por: " + i);
						primo = false;
				 }
			}
			if (primo) {
				 System.out.println("É um número primo.");
			}
	 }
}
