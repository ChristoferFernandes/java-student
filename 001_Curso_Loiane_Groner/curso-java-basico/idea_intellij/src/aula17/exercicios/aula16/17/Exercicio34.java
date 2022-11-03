package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Entre com a informação de um valor: ");
        int valor = tecla.nextInt();

        if(valor == 1 || valor == 2){
            System.out.println("É um número primo.");
            System.exit(0);
        }
        boolean primo = true;
        for (int count = 2;count < valor; count ++ ) {
            if (valor % count == 0) {
                System.out.println("Não é um número PRIMO.");
                primo = false;
            }
        }
        if (primo) {
            System.out.println("É um número primo.");
        }
    }
}
