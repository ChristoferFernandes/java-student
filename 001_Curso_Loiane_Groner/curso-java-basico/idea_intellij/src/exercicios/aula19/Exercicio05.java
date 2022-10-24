package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String [] args) {
        Scanner tecla = new Scanner(System.in);

            int [] vetorA = new int[10];
            int [] vetorB = new int[vetorA.length];

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição do vetor: ");
                vetorA[count] = tecla.nextInt();
                vetorB[count] = vetorA[count] * count;
        }
        System.out.print("VetorA = ");
        for (int count = 0; count < vetorA.length; count++) {
            System.out.print(vetorA[count] +" ");
        }
        System.out.println();
        System.out.print("VetorB = ");
        for (int count = 0; count < vetorB.length; count++) {
            System.out.print(vetorB[count] +" ");
        }
    }
}
