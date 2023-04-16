package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int[] valoresA = new int[20];
	int[] pares = new int[valoresA.length];
	int[] impares = new int[valoresA.length];
	int posPar = 0;
	int posImpar = 0;
	for (int count = 0; count < valoresA.length; count++) {
	  System.out.print("Informe o valor da " + (count + 1) + "º posição: ");
	  valoresA[count] = key.nextInt();
	  if (valoresA[count] % 2 == 0) {
		pares[posPar] = valoresA[count];
		posPar++;
	  } else {
		impares[posImpar] = valoresA[count];
		posImpar++;
	  }
	}
	System.out.println();

	System.out.print("Valores = ");
	for (int count = 0; count < valoresA.length; count++) {
	  System.out.print(valoresA[count] + " ");
	}
	System.out.println();

	System.out.print("Valores pares = ");
	for (int count = 0; count < posPar; count++) {
	  System.out.print(pares[count] + " ");
	}
	System.out.println();

	System.out.print("Valores impares = ");
	for (int count = 0; count < posImpar; count++) {
	  System.out.print(impares[count] + " ");
	}
  }
}
