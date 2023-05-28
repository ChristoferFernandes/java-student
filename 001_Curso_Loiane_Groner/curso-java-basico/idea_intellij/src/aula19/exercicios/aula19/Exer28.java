package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler um vetor A com 10 elementos e construir um vetor B de mesmo  tipo e tamanho e com os mesmos elementos de A, sendo
que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A
passa a ser o penúltimo de B e assim por diante */
public class Exer28 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] numerosVetorA = new int[10];
      int[] numerosVetorB = new int[numerosVetorA.length];

      for (int count = 0; count < numerosVetorA.length; count++) {
          System.out.print("Informe o valor da linha na " + (count + 1) + "º posição: ");
          numerosVetorA[count] = key.nextInt();
          numerosVetorB[numerosVetorA.length - count - 1] = numerosVetorA[count];
      }
      System.out.println();

      System.out.print("numerosVetorA = ");
      for (int i : numerosVetorA) {
          System.out.print(i + " ");
      }
      System.out.println();

      System.out.print("numerosVetorB = ");
      for (int i : numerosVetorB) {
          System.out.print(i + " ");
      }
  }
}
