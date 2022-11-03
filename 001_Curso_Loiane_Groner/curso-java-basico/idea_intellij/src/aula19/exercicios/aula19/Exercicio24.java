package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);

          int[] vetorA = new int[10];
          boolean palindromo = true;

       for (int count = 0; count < vetorA.length; count++) {
           System.out.print("Informe o valor: ");
              vetorA[count] = key.nextInt();
       }
       for (int count = 0; count < (vetorA.length /2); count++) {
           if (vetorA[count] != vetorA[vetorA.length -1 -count]){
               System.out.println("Não é palindromo");
               palindromo = false;
               System.exit(0);
           }
       }
        System.out.println();
        System.out.print("VetorA = ");
        for (int count = 0; count < vetorA.length; count++) {
            System.out.print(vetorA[count] +" ");
        }
    }
}
