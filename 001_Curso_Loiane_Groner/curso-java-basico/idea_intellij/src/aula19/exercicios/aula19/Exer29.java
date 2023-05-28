package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores.
Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos
de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos */
public class Exer29 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] valoresVetorA = new int[10];
      int[] valoresVetorB = new int[valoresVetorA.length];
      int[] valoresVetorC = new int[20];

      for (int count = 0; count < valoresVetorA.length; count++) {
          System.out.print("Informe o valor da " + (count + 1) + "º posição de A: ");
          valoresVetorA[count] = key.nextInt();

          valoresVetorC[count] = valoresVetorA[count];
      }
      for (int count = 0; count < valoresVetorB.length; count++) {
          System.out.print("Informe o valor da " + (count + 1) + "º posição de B: ");
          valoresVetorB[count] = key.nextInt();

          valoresVetorC[valoresVetorA.length + count] = valoresVetorB[count];
      }
      System.out.println();

      System.out.print("valoresVetorA = ");
      for (int i : valoresVetorA) {
          System.out.print(i + " ");
      }

      System.out.println();
      System.out.print("valoresVetorB = ");
      for (int i : valoresVetorB) {
          System.out.print(i + " ");
      }

      System.out.println();
      System.out.print("valoresVetorC = ");
      for (int i : valoresVetorC) {
          System.out.print(i + " ");
      }
  }
}
