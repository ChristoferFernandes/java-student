package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio22 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int[] vetorA = new int[10];
	int qtd0 = 0;
	int qtd1 = 0;

	for (int count = 0; count < vetorA.length; count++) {
	  vetorA[count] = (int) Math.round(Math.random() * 1);

	  if (vetorA[count] == 0) {
		qtd0++;
	  } else {
		qtd1++;
	  }
	}
	double percentual0;
	double percentual1;
	percentual0 = (qtd0 * 100) / vetorA.length;
	percentual1 = (qtd1 * 100) / vetorA.length;

	System.out.print("VetorA = ");
	for (int count = 0; count < vetorA.length; count++) {
	  System.out.print(vetorA[count] + " ");
	}
	System.out.println();
	System.out.println("Percentual 0: " + percentual0);
	System.out.println("Percentual 1: " + percentual1);
  }
}
