package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem
indicando se o respectivo elemento é um número primo ou não */
public class Exer33 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int[] valores = new int[10];
        boolean primo;
        String mensagem;

        primo = true;
        mensagem = "";
        for (int count = 0; count < valores.length; count++) {
            System.out.print("Informe o valor da " + (count + 1) + "º posição: ");
            valores[count] = key.nextInt();
        }
        for (int valor : valores) {
            for (int count = 2; count < valor; count++) {
                if (valor % count == 0) {
                    primo = false;
                    mensagem = " Não é um número primo!";
                    break;
                } else {
                    mensagem = " É um número primo!";
                }
            }
            System.out.println(valor + " " + mensagem);
        }
    }
}
