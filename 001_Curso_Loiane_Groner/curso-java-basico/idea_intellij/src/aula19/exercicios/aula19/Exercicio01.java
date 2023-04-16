package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);
	int[] vetorA = new int[5];
	int[] vetorB = new int[vetorA.length];

	for (int count = 0; count < vetorA.length; count++) {
	  System.out.print("Informe o valor da  " + (count + 1) + "º posição: ");
	  vetorA[count] = tecla.nextInt();
	  vetorB[count] = vetorA[count];
	}
	System.out.print("Vetor A = ");
	for (int count = 0; count < vetorA.length; count++) {
	  System.out.print(vetorB[count] + " ");
	}
	System.out.println();
	System.out.print("Vetor B = ");
	for (int count = 0; count < vetorA.length; count++) {
	  System.out.print(vetorB[count] + " ");
	}
  }
}
