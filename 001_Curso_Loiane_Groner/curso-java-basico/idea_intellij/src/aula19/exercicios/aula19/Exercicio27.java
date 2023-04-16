package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio27 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int[] linhaA = new int[10];
	char[] linhaB = new char[linhaA.length];

	for (int count = 0; count < linhaA.length; count++) {
	  System.out.print("Informe o valor de A na " + (count + 1) + "º posição: ");
	  linhaA[count] = key.nextInt();
	  if (linhaA[count] < 7) {
		linhaB[count] = 'a';
	  } else if (linhaA[count] == 7) {
		linhaB[count] = 'b';
	  } else if (linhaA[count] > 7 && linhaA[count] < 10) {
		linhaB[count] = 'c';
	  } else if (linhaA[count] == 10) {
		linhaB[count] = 'd';
	  } else {
		linhaB[count] = 'e';
	  }
	}
	System.out.println();
	System.out.print("linhaA = ");
	for (int count = 0; count < linhaA.length; count++) {
	  System.out.print(linhaA[count] + " ");
	}
	System.out.println();
	System.out.print("linhaB = ");
	for (int count = 0; count < linhaB.length; count++) {
	  System.out.print(linhaB[count] + " ");
	}
  }
}
