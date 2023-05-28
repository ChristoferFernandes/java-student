package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência
de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2i
.Sugestão int A[11]; */
public class Exer36 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        double[] valores = new double[11];

        for (int cont = 0; cont < valores.length; cont++) {
            valores[cont] = Math.pow(2, cont);
        }
        System.out.println();
        System.out.print("Valores elevados = ");
        for (double valor : valores) {
            System.out.print((int) valor + " ");
        }
    }
}
