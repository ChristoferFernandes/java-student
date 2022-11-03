package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de um número inteiro: ");
            int valor = tecla.nextInt();
        System.out.print("Entre com a informação de um segundo número que seja inteiro: ");
            int valor2 = tecla.nextInt();
        System.out.print("Entre com a informação de um número real: ");
            double valor3 = tecla.nextDouble();

            double resp = 0, resp2 = 0, resp3 = 0;
            resp = (valor * 2) * (valor2 / 2); // o produto do dobro do primeiro com metade do segundo
            resp2 = valor * 3 + valor3; // a soma do triplo do primeiro com o terceiro
            resp3 = Math.pow(valor3,3); // o terceiro elevado ao cubo.

        System.out.println("O produto do dobro do primeiro com metade do segundo: "+ resp);
        System.out.println("A soma do triplo do primeiro com o terceiro: "+ resp2);
        System.out.println("O terceiro elevado ao cubo: "+resp3);

    }
}
