package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        double preco2;

        System.out.print("Informe o preço do pão: R$");
            double preco = tecla.nextDouble();

            preco2 = preco;

        System.out.println("Preço pão: R$"+ preco);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços: ");

        for (int count = 1; count <= 50; count++) {
            System.out.println(count +" - R$"+ preco);
            preco += preco2;
        }
    }
}
