package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples
 dos elementos ímpares armazenados neste vetor */
public class Exer14 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int soma,aux;
	 double media;
	 
	 soma = 0;
	 aux = 0;
	 
	 for (int count = 0; count < vetorA.length; count++) {
		System.out.print("Informe o valor da " + (count + 1) + "º posição do vetor: ");
		vetorA[count] = key.nextInt();
	 }
	 System.out.print("Números Impares = ");
	 for (int i : vetorA) {
		if (i % 2 == 1) {
		  System.out.print(i + " ");
		  soma += i;
		  aux++;
		}
	 }
	 media = (double) soma / aux;
	 System.out.println();
	 System.out.println("Soma dos valores: " + soma);
	 System.out.println("Media dos valores: " + media);
  }
}
