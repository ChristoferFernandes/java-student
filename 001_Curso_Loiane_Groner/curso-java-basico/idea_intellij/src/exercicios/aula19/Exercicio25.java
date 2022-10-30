package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] linhaA = new int[10];
            int[] linhaB = new int[linhaA.length];

        for (int count = 0; count < linhaA.length; count++) {
            System.out.print("Informe o número da "+ (count + 1) +"º posição: ");
                linhaA[count] = key.nextInt();
            if (linhaA[count] % 2 == 0) {
                linhaB[count] = 1;
            } else {
                linhaB[count] = 0;
            }
        }
        System.out.println();
        System.out.print("linhaA = ");
        for (int count = 0; count < linhaA.length; count++) {
            System.out.print(linhaA[count] +" ");
        }
        System.out.println();
        System.out.print("linhaB = ");
        for (int count = 0; count < linhaB.length; count++) {
            System.out.print(linhaB[count] +" ");
        }
    }
}
