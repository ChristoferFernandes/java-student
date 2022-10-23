package src.exercicios.aula1617;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            double preco;
            double soma = 0;
            double media;
        System.out.print("Entre com a informação de quantidade de CD comprados: ");
            int qtdCD = tecla.nextInt();

        for (int count = 1; count <= qtdCD; count++) {
            System.out.print("Informe o valor do "+ count +"º CD: R$");
                preco = tecla.nextDouble();

                soma += preco;
        }
        media = soma / qtdCD;
        System.out.println("O valor médio gasto na compra dos CDs foi de : R$"+ media);
    }
}
