package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que
determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos */
public class Exer17 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] idades = new int[10];
	 int idade = 0;
	 for (int count = 0; count < idades.length; count++) {
		System.out.print("Informe a idade da " + (count + 1) + "º pessoa: ");
		idades[count] = key.nextInt();
	 }
	 System.out.print("Idades informadas: ");
	 for (int i : idades) {
		System.out.print(i + " ");
		if (i > 35) {
		  idade++;
		}
	 }
	 System.out.println();
	 System.out.println("Pessoas com idade maior que 35 anos: " + idade);
  }
}
