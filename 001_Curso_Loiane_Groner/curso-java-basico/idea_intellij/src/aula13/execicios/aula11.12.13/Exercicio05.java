package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Conversor de Metros [m] para Centímetros [cm]. Informe um valor: ");
            double metro = tecla.nextDouble();

            double centimetro = metro * 100;
        System.out.println("Conversão de "+(int)metro+"m é igual a "+(int)centimetro+"cm");
    }
}
