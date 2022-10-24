package src.exercicios.aula19;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("###,###.##");
            int[] vetorA = new int[15];
            double[] vetorB = new double[vetorA.length];

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+(count+1) +"º posição do vetor:");
                vetorA[count] = tecla.nextInt();
                vetorB[count] = Math.sqrt(vetorA[count]);
        }
        System.out.print("VetorA = ");
        for (int count = 0; count < vetorA.length; count++) {
            System.out.print(vetorA[count] +" ");
        }
        System.out.println();
        System.out.print("VetorB = ");
        for (int count = 0; count < vetorB.length; count++) {
            System.out.print(form.format(vetorB[count]) +" ");
        }
    }
}
