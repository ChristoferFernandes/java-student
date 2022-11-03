package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de quanto você ganha por hora: R$");
            double valorHora = tecla.nextDouble();
        System.out.print("Entre com a informação de quanto você trabalhou esse mês: ");
            int horaTrabalhada = tecla.nextInt();

            double salarioBruto = valorHora * horaTrabalhada;
            double inss = 0, fgts = 0, totalDeDescontos =0, salarioLiquido =0, impostoDeRenda = 0, percentual = 0;
        if (salarioBruto <= 900){
            percentual = 0;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDeDescontos = impostoDeRenda + inss;
            salarioLiquido = salarioBruto - totalDeDescontos;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
             percentual = 5;
            impostoDeRenda = (salarioBruto / 100) * percentual;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDeDescontos = impostoDeRenda + inss;
            salarioLiquido = salarioBruto - totalDeDescontos;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            percentual = 10;
            impostoDeRenda = (salarioBruto / 100) * percentual;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDeDescontos = impostoDeRenda + inss;
            salarioLiquido = salarioBruto - totalDeDescontos;
        } else if( salarioBruto > 2500){
            percentual = 20;
            impostoDeRenda = (salarioBruto / 100) * percentual;
            inss = (salarioBruto / 100) * 10;
            fgts = (salarioBruto / 100) * 11;
            totalDeDescontos = impostoDeRenda + inss;
        }
        System.out.println("Sálario Bruto: ("+ valorHora +" * "+ horaTrabalhada +") :  R$"+salarioBruto);
        System.out.println("(-) Imposto de Renda ("+ percentual +"):  R$"+impostoDeRenda);
        System.out.println("FGTS (11%):  R$"+ fgts);
        System.out.println("Total de Descontos:  R$"+ totalDeDescontos);
        System.out.println("Salário Líquido:  R$"+ salarioLiquido);
    }
}
