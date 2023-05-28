package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A */
public class Exer32 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int[] valores = new int[5];

        for (int cont = 0; cont < valores.length; cont++) {
            System.out.print("Informe os valores que você quer ver a tabuada: ");
            valores[cont] = key.nextInt();
        }
        for (int valor : valores) {
            System.out.println("Tabuada de: " + valor);
            for (int count = 1; count <= 10; count++) {
                System.out.println(valor + " * " + count + " = " + (valor * count));
            }
            System.out.println();
        }
    }
}
