package src.exercicios.aula1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("###,###.##");

            double percentual = 1.5;
            double salarioAtual;
            double soma;

        System.out.print("Informe o salário inicial: R$");
            double salario = tecla.nextDouble();
        System.out.println("Salário em 1995 é de R$"+ formato.format(salario));
            salarioAtual = (salario /100) * percentual;
            soma = salario + salarioAtual;
        System.out.println("Saláro em 1996 é de R$"+ formato.format(soma));

        for (int count = 1997; count <= 2022; count++) {
            percentual *= 2;
            salarioAtual = (salario / 100) * percentual;
            soma += salarioAtual;
            System.out.println("Salario em "+ count +" é de R$"+ formato.format(soma));
        }
    }
}
