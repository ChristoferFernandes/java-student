package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo
as seguintes regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi; b) Ci deverá receber 0 quando Ai for
igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi */
public class Exer26 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] linhaA = new int[10];
      int[] linhaB = new int[linhaA.length];
      int[] linhaC = new int[linhaA.length];

      for (int count = 0; count < linhaA.length; count++) {
          System.out.print("informe o valor de A, na " + (count + 1) + "º posição: ");
          linhaA[count] = key.nextInt();
          System.out.print("informe o valor de B, na " + (count + 1) + "º posição: ");
          linhaB[count] = key.nextInt();

          if (linhaA[count] > linhaB[count]) {
              linhaC[count] = 1;
          } else if (linhaA[count] == linhaB[count]) {
              linhaC[count] = 0;
          } else if (linhaB[count] > linhaA[count]) {
              linhaC[count] = -1;
          }
      }

      System.out.println();
      System.out.print("linhaA = ");
      for (int i : linhaA) {
          System.out.print(i + " ");
      }
      System.out.println();
      System.out.print("linhaB = ");
      for (int i : linhaB) {
          System.out.print(i + " ");
      }
      System.out.println();
      System.out.print("linhaC = ");
      for (int i : linhaC) {
          System.out.print(i + " ");
      }
  }
}
