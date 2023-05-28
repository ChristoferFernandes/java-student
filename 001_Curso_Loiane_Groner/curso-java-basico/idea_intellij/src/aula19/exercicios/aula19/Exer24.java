package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda
para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10
elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do
vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um
 palíndromo*/
public class Exer24 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);

      int[] vetorA = new int[10];
      boolean palindromo = true;

      for (int count = 0; count < vetorA.length; count++) {
          System.out.print("Informe o valor: ");
          vetorA[count] = key.nextInt();
      }
      for (int count = 0; count < (vetorA.length / 2); count++) {
          if (vetorA[count] != vetorA[vetorA.length - 1 - count]) {
              System.out.println("Não é palindromo");
              palindromo = false;
              System.exit(0);
          }
      }
      System.out.println();
      System.out.print("VetorA = ");
      for (int i : vetorA) {
          System.out.print(i + " ");
      }
  }
}
