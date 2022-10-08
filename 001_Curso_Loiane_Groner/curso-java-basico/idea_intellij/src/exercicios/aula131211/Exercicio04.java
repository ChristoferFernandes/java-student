package src.exercicios.aula131211;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Por favor informe a nota dos 4 bimestres abaixo.");
        System.out.print("Nota1: ");
            double valor = tecla.nextDouble();
        System.out.print("Nota2: ");
            double valor2 = tecla.nextDouble();
        System.out.print("Nota3: ");
            double valor3 = tecla.nextDouble();
        System.out.print("Nota4: ");
            double valor4 = tecla.nextDouble();

            double media = (valor + valor2 + valor3 + valor4) / 4;
        System.out.println("Sua média é: " + media);
    }
}
