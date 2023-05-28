package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja:
B[i] := A[i] % 2.*/
public class Exer10 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int[] vetorB = new int[vetorA.length];
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o valor da " + (i + 1) + "º posição do vetor: ");
		vetorA[i] = key.nextInt();
		vetorB[i] = vetorA[i] % 2;
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
  }
}
