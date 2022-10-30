package src.exercicios.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");
            double [] cotacao = new double[21];

        System.out.print("Informe o preço do dollar autal: U$: ");
            double dollar = key.nextDouble();


        for (int count = 1; count < cotacao.length; count++) {
            cotacao[count] = dollar;
            cotacao[count] *= count;
            System.out.println("A cotação do dollar na "+ (count) +"º posição é: U$"+ df.format(cotacao[count]));
        }
    }
}
