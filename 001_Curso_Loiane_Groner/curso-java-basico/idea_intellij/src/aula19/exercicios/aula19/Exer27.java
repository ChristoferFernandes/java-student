package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá receber 'b' quando Ai for igual a 7;
c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for igual a 10; e
e) Bi deverá receber 'e' quando Ai for maior que 10. Sugestão: char B[10]; */
public class Exer27 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] linhaA = new int[10];
      char[] linhaB = new char[linhaA.length];

      for (int count = 0; count < linhaA.length; count++) {
          System.out.print("Informe o valor de A na " + (count + 1) + "º posição: ");
          linhaA[count] = key.nextInt();
          if (linhaA[count] < 7) {
              linhaB[count] = 'a';
          } else if (linhaA[count] == 7) {
              linhaB[count] = 'b';
          } else if (linhaA[count] > 7 && linhaA[count] < 10) {
              linhaB[count] = 'c';
          } else if (linhaA[count] == 10) {
              linhaB[count] = 'd';
          } else {
              linhaB[count] = 'e';
          }
      }
      System.out.println();
      System.out.print("linhaA = ");
      for (int i : linhaA) {
          System.out.print(i + " ");
      }
      System.out.println();
      System.out.print("linhaB = ");
      for (char c : linhaB) {
          System.out.print(c + " ");
      }
  }
}
