package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio36 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	double[] valores = new double[11];

	for (int cont = 0; cont < valores.length; cont++) {
	  valores[cont] = Math.pow(2, cont);
	}
	System.out.println();
	System.out.print("Valores elevados = ");
	for (int cont = 0; cont < valores.length; cont++) {
	  System.out.print((int) valores[cont] + " ");
	}
  }
}
