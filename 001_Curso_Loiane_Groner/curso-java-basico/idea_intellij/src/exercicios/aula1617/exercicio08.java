package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int count = 1;
            double valor;
            double soma = 0;
            double media = 0;

        while (count <= 5) {
            System.out.print("Informe um valor: ");
                valor = tecla.nextDouble();

                soma += valor;
                count ++;
        }
            media = soma / 5;
        System.out.println("A soma dos valores: "+ soma);
        System.out.println("A média da soma dos valores: "+ media);
    }
}
