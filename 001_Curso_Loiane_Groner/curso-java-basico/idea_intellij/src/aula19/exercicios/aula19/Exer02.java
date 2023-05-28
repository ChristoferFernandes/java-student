package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do
vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2 */
public class Exer02 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[8];
	 int[] vetorB = new int[vetorA.length];
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe um número para " + (i + 1) + "º posição do vetor: ");
		vetorA[i] = key.nextInt();
		vetorB[i] = vetorA[i] * 2;
	 }
	 
	 System.out.print("VetorA = ");
	 for (int i : vetorA) {
		System.out.print(i + " ");
	 }
	 
	 System.out.println();
	 System.out.print("VetorB = ");
	 for(int j : vetorB) {
		System.out.print(j + " ");
	 }
  }
}
