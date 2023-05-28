package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e
ímpares, respectivamente, armazenados neste vetor. */
public class Exer15 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 double qtdPar, perPar, qtdImpar, perImpar;
	 
	 qtdPar = 0;
	 qtdImpar = 0;
	 for (int count = 0; count < vetorA.length; count++) {
		System.out.print("Informe o valor da " + (count + 1) + "º posição do vetor: ");
		vetorA[count] = key.nextInt();
	 }
	 System.out.print("Números Pares = ");
	 for (int i : vetorA) {
		if (i % 2 == 0) {
		  System.out.print(i + " ");
		  qtdPar++;
		}
	 }
	 System.out.println();
	 System.out.print("Números Impares = ");
	 for (int j : vetorA) {
		if (j % 2 == 1) {
		  System.out.print(j + " ");
		  qtdImpar++;
		}
	 }
	 perPar = (qtdPar * 100) / vetorA.length;
	 perImpar = (qtdImpar * 100) / vetorA.length;
	 System.out.println();
	 System.out.println("Percentual de números pares: " + perPar + "%");
	 System.out.println("Percentual de números impares " + perImpar + "%");
  }
}
