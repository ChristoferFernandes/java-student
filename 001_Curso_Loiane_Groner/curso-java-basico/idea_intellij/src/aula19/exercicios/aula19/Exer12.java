package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos
 armazenados neste vetor. */
public class Exer12 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int soma = 0;
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o valor da " + (i + 1) + "º posição do vetor: ");
		vetorA[i] = key.nextInt();
		soma += vetorA[i];
	 }
	 System.out.print("VetorA = ");
	 for(int j : vetorA){
		System.out.print(j + " ");
	 }
	 System.out.println();
	 System.out.println("A soma dos valores acima é de : " + soma);
	 
  }
}
