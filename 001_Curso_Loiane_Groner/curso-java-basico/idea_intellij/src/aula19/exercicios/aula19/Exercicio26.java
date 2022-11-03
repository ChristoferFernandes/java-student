package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] linhaA = new int[10];
            int[] linhaB = new int[linhaA.length];
            int[] linhaC = new int[linhaA.length];

        for (int count = 0; count < linhaA.length; count++) {
            System.out.print("informe o valor de A, na "+ (count + 1) +"º posição: ");
                linhaA[count] = key.nextInt();
            System.out.print("informe o valor de B, na "+ (count + 1) +"º posição: ");
                linhaB[count] = key.nextInt();
            if (linhaA[count] > linhaB[count]) {
                linhaC[count] = 1;
            } else if (linhaA[count] == linhaB[count]) {
                linhaC[count] = 0;
            } else if (linhaB[count] > linhaA[count]) {
                linhaC[count] = -1;
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
        System.out.println();
        System.out.print("linhaC = ");
        for (int count = 0; count < linhaC.length; count ++) {
            System.out.print(linhaC[count] +" ");
        }
    }
}
