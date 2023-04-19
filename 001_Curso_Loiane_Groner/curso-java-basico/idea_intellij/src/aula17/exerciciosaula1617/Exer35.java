package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes
entre 1 e um número inteiro informado pelo usuário */
public class Exer35 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int num;
			boolean primo;
			
			System.out.print("Informe um número: ");
			num = key.nextInt();
			
			for (int i = 1; i <= num; i++) {
				 primo = true;
				 
				 for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							 //System.out.println("Não é um número PRIMO.");
							 primo = false;
						}
				 }
				 if (primo) {
						System.out.println(i);
				 }
			}
	 }
}
