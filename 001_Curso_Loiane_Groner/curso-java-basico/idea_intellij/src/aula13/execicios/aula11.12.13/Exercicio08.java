package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de quanto você ganha por hora: R$");
            double salarioHora = tecla.nextDouble();

        System.out.print("Entre com a informação de quantas horas você trabalha por mês: ");
            double horasTrabalhadas = tecla.nextDouble();

            double salarioMes = horasTrabalhadas * salarioHora;
        System.out.println("seu salário mensal está na média de: R$ "+salarioMes);
    }
}
