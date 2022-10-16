package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        long fatorial, valor;


        System.out.print("Entre com a informação do número que deseja ver o fatorial: ");
        int num = tecla.nextInt();

        System.out.println("Fatorial de " + num + "!: ");

            valor = num;
            fatorial = num;
        while (num > 2) {
                valor --;
                fatorial = fatorial * valor;
            System.out.println(fatorial);
            num --;
        }
    }
}


