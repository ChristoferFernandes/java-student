package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de quanto você ganha por hora: R$");
            double valorPorHora = tecla.nextDouble();
        System.out.print("Entre com a informação de quantas hotas você trabalha por mês: ");
            double horasTrabalhadas = tecla.nextDouble();

            double salarioBruto = valorPorHora * horasTrabalhadas;
            double impostoDeRenda = (salarioBruto / 100) * 11;
            double inss = (salarioBruto / 100) * 8;
            double sindicato = (salarioBruto / 100) * 5;
            double descontos = impostoDeRenda + inss + sindicato;
            double salarioLiquido = salarioBruto - descontos;

        System.out.println("Salario Bruto: R$"+ salarioBruto);
        System.out.println("Imposto de Renda (-11%): R$"+ impostoDeRenda);
        System.out.println("INSS (-8%): R$"+ inss);
        System.out.println("sindicato (-5%): R$"+ sindicato);
        System.out.println("Total de descontos: R$"+ descontos);
        System.out.println("Salario Líquido: R$"+ salarioLiquido);

    }
}
