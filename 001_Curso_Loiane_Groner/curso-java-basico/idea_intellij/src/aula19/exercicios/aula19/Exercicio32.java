package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio32 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] valoresVetorA = new int[5];
	 
	 for (int cont = 0; cont < valoresVetorA.length; cont++) {
		System.out.print("Informe os valores que você quer ver a tabuada: ");
		valoresVetorA[cont] = key.nextInt();
	 }
	 for (int cont = 0; cont < valoresVetorA.length; cont++) {
		System.out.println("Tabuada de: " + valoresVetorA[cont]);
		for (int count = 1; count <= 10; count++) {
		  System.out.println(valoresVetorA[cont] + " * " + count + " = " + (valoresVetorA[cont] * count));
		}
		System.out.println();
	 }
  }
}
