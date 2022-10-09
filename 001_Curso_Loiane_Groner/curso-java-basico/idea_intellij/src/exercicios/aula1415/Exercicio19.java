package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe um número abaixo de 1.000: ");
            int valor = tecla.nextInt();

            int centena = valor / 100;
            int dezena = (valor % 100) / 10;
            int unidade = (valor % 100 % 10);
        if (valor >= 100) {
            System.out.println(valor + " = " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");
        } else if (valor >= 10) {
            System.out.println(valor + " = "+ dezena + " dezenas e " + unidade + " unidades.");
        } else {
            System.out.println(valor+" = "+unidade+" unidades.");
        }
    }
}

