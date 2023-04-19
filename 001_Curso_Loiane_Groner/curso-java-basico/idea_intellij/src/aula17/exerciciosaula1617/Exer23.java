package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.*/
public class Exer23 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int num, cont;
			boolean primo;
			
			System.out.print("Informe um número: ");
			num = key.nextInt();
			
			if (num == 1 || num == 2) {
				 System.out.println(num + " é um número primo, e foram feitas 0 diviões para descobrir isso.");
			} else if (num % 2 == 0) {
				 System.out.println(num + " não é um numero primo, e foi feita 1 divisão para descobrir isso.");
			} else {
				 cont = 0;
				 primo = true;
				 for (int i = 2; i < num; i += 2) {
						cont += 1;
						if (num % 2 == 0) {
							 primo = false;
							 break;
						}
				 }
				 if (primo) {
						System.out.println(num + " é primo, e foram executadas " + cont + " divisões para descobrir isso.");
				 } else {
						System.out.println(num + " não é um número primo, e foram executadas " + cont + " divisões para descobrir isso.");
				 }
			}
	 }
}
