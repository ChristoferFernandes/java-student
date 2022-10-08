package src.exercicios.aula131211;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação da temperatura em Celsius:");
            double celsius = tecla.nextDouble();

            double farenheit = (celsius * 1.8) + 32;
        System.out.println("A conversão para temperatura Farenheit é: "+ farenheit +"Fº");
    }
}
