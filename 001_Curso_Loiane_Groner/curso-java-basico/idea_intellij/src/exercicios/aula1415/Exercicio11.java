package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do salário do funcionário: R$");
            double salarioBase = tecla.nextDouble();

            double aumento = 0, novoSalario = 0;
            int reajuste = 0;
        if (salarioBase <= 280){
            reajuste = 20;
            aumento = (salarioBase / 100) * reajuste;
            novoSalario = salarioBase + aumento;
        } else if (salarioBase > 280 && salarioBase <= 700){
            reajuste = 15;
            aumento = (salarioBase / 100) * reajuste;
            novoSalario = salarioBase + aumento;
        } else if (salarioBase > 700 && salarioBase <= 1500){
            reajuste = 10;
            aumento = (salarioBase / 100) * reajuste;
            novoSalario = salarioBase + aumento;
        } else {
            reajuste = 5;
            aumento = (salarioBase / 100) * reajuste;
            novoSalario = salarioBase + aumento;
        }
        System.out.println("Salario base: R$"+ salarioBase);
        System.out.println("Percentual do aumento: "+ reajuste +"%");
        System.out.println("Aumento: R$"+ aumento);
        System.out.println("Novo salário: R$"+ novoSalario);
    }
}
