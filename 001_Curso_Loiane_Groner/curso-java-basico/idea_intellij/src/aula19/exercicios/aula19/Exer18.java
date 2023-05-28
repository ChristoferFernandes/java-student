package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que
 determine e escreva a menor e a maior idades e suas respectivas posições. */
public class Exer18 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] idades = new int[10];
	 int ageMin = Integer.MAX_VALUE;
	 int ageMax = Integer.MIN_VALUE;
	 int posMax, posMin;
	 
	 posMax = 0;
	 posMin = 0;
	 for (int count = 0; count < idades.length; count++) {
		System.out.print("Informe a idade da " + (count + 1) + "º pessoa: ");
		idades[count] = key.nextInt();
	 }
	 System.out.print("idades informadas: ");
	 
	 for (int count = 0; count < idades.length; count++) {
		System.out.print(idades[count] + " ");
		if (idades[count] > ageMax) {
		  ageMax = idades[count];
		  posMax = count + 1;
		} else if (idades[count] < ageMin) {
		  ageMin = idades[count];
		  posMin = count + 1;
		}
	 }
	 System.out.println();
	 System.out.println("A maior idade informada foi: " + ageMax + " anos e estava na " + posMax + "º posição");
	 System.out.println("A menor idade informada foi: " + ageMin + " anos e estava na " + posMin + "º posição");
  }
}
