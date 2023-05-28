package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: a) a soma de elementos
 armazenados neste vetor que são inferiores a 15; b) a quantidade de elementos armazenados no vetor que são iguais a 15;
  e c) a média dos elementos armazenados no vetor que são superiores a 15. */
public class Exer16 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int casoA, casoB, casoC;
	 double media;
	 
	 casoA = 0;
	 casoB = 0;
	 casoC = 0;
	 for (int count = 0; count < vetorA.length; count++) {
		System.out.print("Informe o valor da " + (count + 1) + "º posição do vetor: ");
		vetorA[count] = key.nextInt();
	 }
	 System.out.print("vetorA = ");
	 for (int i : vetorA) {
		System.out.print(i + " ");
		if (i < 15) {
		  casoA += i;
		} else if (i == 15) {
		  casoB++;
		} else {
		  casoC += i;
		}
	 }
	 media = (double) casoC / vetorA.length;
	 System.out.println();
	 System.out.println("A- a soma dos valores inferiores a 15: " + casoA);
	 System.out.println("B- a quantidade de elementos que são iguais a 15: " + casoB);
	 System.out.println("C- a média dos valores que são maiores que 15: " + media);
  }
}
