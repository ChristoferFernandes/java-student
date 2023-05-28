package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos"
elementos do vetor A, ou seja, B[i] = A[i]. */
public class Exer01 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[5];
	 int[] vetorB = new int[vetorA.length];
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o valor da  " + (i + 1) + "º posição: ");
		vetorA[i] = key.nextInt();
		vetorB[i] = vetorA[i];
	 }
	 System.out.print("Vetor A = ");
	 for (int i : vetorA) {
		System.out.print(i + " ");
	 }
	 System.out.println();
	 System.out.print("Vetor B = ");
	 for (int j : vetorB) {
		System.out.print(j + " ");
	 }
  }
}
