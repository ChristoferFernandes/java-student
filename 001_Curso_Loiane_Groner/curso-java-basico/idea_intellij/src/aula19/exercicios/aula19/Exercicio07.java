package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
	 Scanner tecla = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int[] vetorB = new int[vetorA.length];
	 int[] vetorC = new int[vetorA.length];
	 
	 for (int count = 0; count < vetorA.length; count++) {
		System.out.print("Informe o valor da " + (count + 1) + "º posição do vetor A: ");
		vetorA[count] = tecla.nextInt();
	 }
	 for (int count = 0; count < vetorB.length; count++) {
		System.out.print("Informe o valor da " + (count + 1) + "º posição do vetor B: ");
		vetorB[count] = tecla.nextInt();
		vetorC[count] = vetorA[count] - vetorB[count];
	 }
	 System.out.print("VetorA = ");
	 for (int count = 0; count < vetorA.length; count++) {
		System.out.print(vetorA[count] + " ");
	 }
	 System.out.println();
	 System.out.print("VetorB = ");
	 for (int count = 0; count < vetorB.length; count++) {
		System.out.print(vetorB[count] + " ");
	 }
	 System.out.println();
	 System.out.print("VetorC = ");
	 for (int count = 0; count < vetorC.length; count++) {
		System.out.print(vetorC[count] + " ");
	 }
  }
}
