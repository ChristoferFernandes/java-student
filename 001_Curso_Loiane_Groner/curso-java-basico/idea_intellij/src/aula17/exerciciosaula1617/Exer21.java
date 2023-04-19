package src.aula17.exerciciosaula1617;

import java.util.Scanner;

public class Exer21 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			
			System.out.print("Informe um número: ");
			int num = key.nextInt();
			
			boolean primo = true;
			for (int i = 2; i < num; i++) {
				 if (num % i == 0) {
						System.out.println("Não é um número PRIMO.");
						primo = false;
						break;
				 }
			}
			if (primo) {
				 System.out.println("É um número primo.");
			}
	 }
}
