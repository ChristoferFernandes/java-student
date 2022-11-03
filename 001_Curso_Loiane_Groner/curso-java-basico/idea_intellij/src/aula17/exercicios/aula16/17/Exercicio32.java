package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int fatorial, valor;
        System.out.println("Entre com a informação de um número inteiro: ");
            int num = tecla.nextInt();

        System.out.println("Fatorial de: "+ num);
        System.out.print("5! = ");

            valor = num;
            fatorial = num;
        while (num > 1) {
            valor --;
            fatorial = fatorial * valor;
            System.out.print(num);
            System.out.print(" . ");
            num --;
        }
        System.out.println(" 1 = "+ fatorial);
    }
}
