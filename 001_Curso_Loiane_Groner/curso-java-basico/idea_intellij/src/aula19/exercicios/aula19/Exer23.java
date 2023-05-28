package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A
são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor
 deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir este propósito */
public class Exer23 {
  public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

     int[] vetorA = new int[10];

     for (int count = 0; count < vetorA.length; count++) {
          System.out.print("Informe o " + (count + 1) + "º valor: ");
          vetorA[count] = key.nextInt();
          if (vetorA[count] % 2 == 1) {
              System.out.println(vetorA[count] + " é um número IMPAR.");
              System.out.println("O programa está sendo encerrado...");
              break;
          }
      }
  }
}
