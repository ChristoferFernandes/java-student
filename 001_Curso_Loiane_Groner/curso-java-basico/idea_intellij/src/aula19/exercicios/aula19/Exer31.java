package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B.
Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos
de A que são ímpares */
public class Exer31 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int[] valores = new int[20];
        int[] parEImpar = new int[valores.length];
        int aux;

        aux = 0;
        for (int count = 0; count < valores.length; count++) {
            System.out.print("Informe o valor da " + (count + 1) + "º posição: ");
            valores[count] = key.nextInt();
        }
        for (int valor : valores) {
            if (valor % 2 == 0) {
                parEImpar[aux] = valor;
                aux++;
            }
        }
        for (int valor : valores) {
            if (valor % 2 != 0) {
                parEImpar[aux] = valor;
                aux++;
            }
        }

        System.out.println();
        System.out.print("Valores informados = ");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println();
        System.out.print("Valores Par e Impar = ");
        for (int i : parEImpar) {
            System.out.print(i + " ");
        }
    }
}
