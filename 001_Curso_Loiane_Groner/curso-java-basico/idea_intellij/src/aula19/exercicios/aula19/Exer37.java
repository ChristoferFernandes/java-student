package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B
seja o fatorial do elemento correspondente em A */
public class Exer37 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int[] valoresA = new int[15];
        int[] valoresB = new int[valoresA.length];

        for (int cont = 0; cont < valoresA.length; cont++) {
            System.out.print("Informe o valor da " + (cont + 1) + "º posição: ");
            valoresA[cont] = key.nextInt();
        }
        for (int i = 0; i < valoresA.length; i++) {
            valoresB[i] = 1;
            for (int j = 1; j <= valoresA[i]; j++) {
                valoresB[i] *= j;
            }
        }

        System.out.println();
        System.out.print("Valores A: ");
        for (int i : valoresA) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Valores B: ");
        for (int cont = 0; cont < valoresA.length; cont++) {
            System.out.print(valoresB[cont] + " ");
        }
    }
}
