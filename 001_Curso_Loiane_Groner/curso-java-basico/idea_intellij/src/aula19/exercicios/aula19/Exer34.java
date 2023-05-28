package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de
todos os pares de 0 até o respectivo elemento. */
public class Exer34 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int[] valores = new int[10];

        for (int cont = 0; cont < valores.length; cont++) {
            System.out.print("Informe o valor da " + (cont + 1) + "º posição: ");
            valores[cont] = key.nextInt();
        }
        for (int valor : valores) {
            System.out.println("Analisando o número: " + valor);
            for (int count = 2; count < valor; count++) {
                if (count % 2 == 0) {
                    System.out.println("Valores que são pares = " + count);
                }
            }
            System.out.println();
        }
    }
}
