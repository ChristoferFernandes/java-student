package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe que ano quer saber se é bissexto: ");
        int ano = tecla.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " é um ano Bissexto.");
        }else{
            System.out.println(ano + " não é um ano Bissexto.");
        }
    }
}

