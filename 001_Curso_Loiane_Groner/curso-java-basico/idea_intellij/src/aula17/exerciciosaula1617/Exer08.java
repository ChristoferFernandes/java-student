package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//. Faça um programa que leia 5 números e informe a soma e a média dos números
public class Exer08 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int i;
			double valor, soma, media;
			
			i = 1;
			soma = 0;
			while (i <= 5) {
				 System.out.print("Informe um valor: ");
				 valor = key.nextDouble();
				 
				 soma += valor;
				 i++;
			}
			media = soma / 5;
			System.out.println("A soma dos valores: " + soma);
			System.out.println("A média da soma dos valores: " + media);
	 }
}
