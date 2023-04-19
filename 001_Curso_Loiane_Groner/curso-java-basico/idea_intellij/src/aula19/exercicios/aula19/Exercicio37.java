package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio37 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int[] valoresA = new int[15];
			int[] valoresB = new int[valoresA.length];
			
			for (int cont = 0; cont < valoresA.length; cont++) {
				 System.out.print("Informe o valor da " + (cont + 1) + "º posição: ");
				 valoresA[cont] = key.nextInt();
			}
			for (int cont = 0; cont < valoresA.length; cont++) {
				 valoresB[cont] = 1;
				 for (int count = 1; count <= valoresA[cont]; count++) {
						valoresB[cont] *= count;
				 }
			}
			System.out.println();
			
			System.out.print("Valores A: ");
			for (int cont = 0; cont < valoresA.length; cont++) {
				 System.out.print(valoresA[cont] + " ");
			}
			System.out.println();
			
			System.out.print("Valores B: ");
			for (int cont = 0; cont < valoresA.length; cont++) {
				 System.out.print(valoresB[cont] + " ");
			}
	 }
}
