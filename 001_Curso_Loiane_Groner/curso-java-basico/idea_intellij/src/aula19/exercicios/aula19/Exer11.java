package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Implementar um programa  que defina e escreva a quantidade de elementos
 armazenados neste vetor que são pares. */
public class Exer11 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int par;
	 
	 par = 0;
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o núero da " + (i + 1) + "º posição do vetor: ");
		vetorA[i] = key.nextInt();
		if (vetorA[i] % 2 == 0) {
		  par++;
		}
	 }
	 System.out.print("Números pares informados pelo usuário: ");
	 for(int j: vetorA) {
		if (j % 2 == 0) {
		  System.out.print(j + " ");
		}
	 }
	 System.out.println();
	 System.out.println("O total de números pares informados é de: " + par);
  }
}

