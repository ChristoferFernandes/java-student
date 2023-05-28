package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados
 neste vetor que são múltiplos de 5 */
public class Exer13 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int[] vetorA = new int[10];
	 int soma = 0;
	 
	 for (int cont = 0; cont < vetorA.length; cont++) {
		System.out.print("Informe o valor da " + (cont + 1) + "º posição: ");
		vetorA[cont] = key.nextInt();
	 }
	 System.out.print("VetorA = ");
	 for (int i: vetorA) {
		if (i % 5 == 0) {
		  System.out.print(i + " ");
		  soma += i;
		}
	 }
	 System.out.println();
	 System.out.println("A soma dos valores: " + soma);
  }
}
