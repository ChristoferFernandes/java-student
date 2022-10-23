package src.exercicios.aula1617;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            double maiorValor = 0;
            double menorValor = 0;
            double soma = 0;
            double diferenca = 0;

        System.out.print("Entre com a informação de quantos números terá no conjunto numérico: ");
        int valor = tecla.nextInt();

        for(int count = 1; count <= valor; count ++) {
            System.out.print("Entre com a informação do "+ count +"º valor: ");
            double num = tecla.nextDouble();

            if (num >= 0 && num < 1000) {

            } else {
                System.out.println("Não pode informar valores menor que 0 ou maior que 1.000");
                System.out.println("Encerrando o programa...");
                System.exit(0);
            }

            if (num > diferenca) {
                maiorValor = num;
            } else if (num < diferenca) {
                menorValor = num;
            }
            diferenca = num;
            soma += diferenca;
        }
        System.out.println("O maior valor digitado foi: "+ maiorValor);
        System.out.println("O menor valor digitado foi: "+ menorValor);
        System.out.println("A soma entre os valores é de: "+ soma);
    }
}
