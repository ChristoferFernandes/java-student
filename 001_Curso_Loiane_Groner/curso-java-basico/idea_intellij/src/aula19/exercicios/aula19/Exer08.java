package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos
respectivos elementos em A e B, ou seja:
C[i] = A[i] * B[i]. */
public class Exer08 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int[] vetorB = new int[vetorA.length];
	 int[] vetorC = new int[vetorA.length];
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o valor da " + (i + 1) + "º posição do vetor A: ");
		vetorA[i] = key.nextInt();
	 }
	 for (int i = 0; i < vetorB.length; i++) {
		System.out.print("Informe o valor da " + (i + 1) + "º posição do vetor B: ");
		vetorB[i] = key.nextInt();
		vetorC[i] = vetorA[i] * vetorB[i];
	 }
	 System.out.print("VetorA = ");
	 for (int i : vetorA) {
		System.out.print(i + " ");
	 }
	 
	 System.out.println();
	 System.out.print("VetorB = ");
	 for (int j : vetorB) {
		System.out.print(j + " ");
	 }
	 
	 System.out.println();
	 System.out.print("VetorC = ");
	 for (int k : vetorC) {
		System.out.print(k + " ");
	 }
  }
}
