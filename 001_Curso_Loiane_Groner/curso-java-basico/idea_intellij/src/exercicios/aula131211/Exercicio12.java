package src.exercicios.aula131211;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação da altura do usuário: ");
            double altura = tecla.nextDouble();

            double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal: "+ pesoIdeal);
    }
}
