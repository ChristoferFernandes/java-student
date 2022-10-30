package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] numerosVetorA = new int[10];
            int[] numerosVetorB = new int[numerosVetorA.length];

        for (int count = 0; count < numerosVetorA.length; count++) {
            System.out.print("Informe o valor da linha na "+ (count+1) +"º posição: ");
                numerosVetorA[count] = key.nextInt();
            numerosVetorB[numerosVetorA.length -count - 1] = numerosVetorA[count];
        }
        System.out.println();

        System.out.print("numerosVetorA = ");
        for (int count = 0; count < numerosVetorA.length; count++) {
            System.out.print(numerosVetorA[count] +" ");
        }
        System.out.println();

        System.out.print("numerosVetorB = ");
        for (int count = 0; count < numerosVetorB.length; count++) {
            System.out.print(numerosVetorB[count] +" ");
        }
    }
}
