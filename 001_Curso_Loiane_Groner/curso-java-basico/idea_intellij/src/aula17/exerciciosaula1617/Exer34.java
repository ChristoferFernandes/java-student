package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Os números primos possuem várias aplicações dentro da computação, por exemplo na Criptografia.
Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa
que peça um número inteiro e determine se ele é ou não um número primo. */
public class Exer34 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int num;
	 boolean primo;
	 
	 System.out.print("Informe um número: ");
	 num = key.nextInt();
	 
	 if (num == 1 || num == 2) {
		System.out.println("É um número primo.");
		System.exit(0);
	 }
	 primo = true;
	 for (int i = 2; i < num; i++) {
		if (num % i == 0) {
		  System.out.println("Não é um número PRIMO.");
		  primo = false;
		}
	 }
	 if (primo) {
		System.out.println("É um número primo.");
	 }
  }
}
