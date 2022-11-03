package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe um número: ");
            int numero = tecla.nextInt();

        System.out.println("O número informado foi "+ numero);
    }
}
