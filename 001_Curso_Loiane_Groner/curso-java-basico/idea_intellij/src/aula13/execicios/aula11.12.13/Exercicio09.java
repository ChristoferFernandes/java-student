package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação da temperatura em Fahrenheit: ");
            double fahrenheit = tecla.nextDouble();

            double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("A conversão para temperatura Celsius é: "+ (int)celsius +"Cº");
    }
}
