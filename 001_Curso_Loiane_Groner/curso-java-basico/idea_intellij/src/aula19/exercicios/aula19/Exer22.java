package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de números 0's
 e 1's existentes no vetor A. */
public class Exer22 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] vetorA = new int[10];
      int qtd0, qtd1;
      double percentual0, percentual1;

      qtd0 = 0;
      qtd1 = 0;
      for (int count = 0; count < vetorA.length; count++) {
          vetorA[count] = (int) Math.round(Math.random() * 1);

          if (vetorA[count] == 0) {
              qtd0++;
          } else {
              qtd1++;
          }
      }
      percentual0 = (qtd0 * 100) / vetorA.length;
      percentual1 = (qtd1 * 100) / vetorA.length;

      System.out.print("VetorA = ");
      for (int i : vetorA) {
          System.out.print(i + " ");
      }
      System.out.println();
      System.out.println("Percentual 0: " + percentual0);
      System.out.println("Percentual 1: " + percentual1);
  }
}
