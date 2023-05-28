package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras
de formação: a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar */
public class Exer25 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] linhaA = new int[10];
      int[] linhaB = new int[linhaA.length];

      for (int count = 0; count < linhaA.length; count++) {
          System.out.print("Informe o número da " + (count + 1) + "º posição: ");
          linhaA[count] = key.nextInt();
          if (linhaA[count] % 2 == 0) {
              linhaB[count] = 1;
          } else {
              linhaB[count] = 0;
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
  }
}
