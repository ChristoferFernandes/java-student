package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de um valor: ");
        int valor = tecla.nextInt();

        boolean primo = true;
        for (int count = 2;count < valor; count ++ ) {
            if (valor % count == 0) {
                System.out.println("Não é um número PRIMO. - É divisível por: "+count);
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É um número primo.");
        }
    }
}
