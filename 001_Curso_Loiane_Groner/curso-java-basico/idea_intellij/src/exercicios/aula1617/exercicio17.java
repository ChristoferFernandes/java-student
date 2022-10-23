package src.exercicios.aula1617;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        long fatorial, valor;


        System.out.print("Entre com a informação de um número: ");
        int num = tecla.nextInt();

        System.out.println("Fatorial de " + num + "! ");

            valor = num;
            fatorial = num;
        while (num > 2) {
            valor --;
            fatorial = fatorial * valor;
            num --;
        }
        System.out.println(fatorial);
    }
}


