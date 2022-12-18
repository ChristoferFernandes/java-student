package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Entre em com a informação do dia em que estamos: ");
            int dia = tecla.nextInt();

            int fevereiro = dia;
        if(dia < 1 || dia > 31) {
            System.out.println(dia + " Não corresponde a um dia válido.");
            System.exit(0);
        }

        System.out.print("Entre em com a informação do mês em que estamos: ");
            int mes = tecla.nextInt();

        if(mes < 0 || mes > 12){
            System.out.println(dia+ " Não corresponde a um mês válido.");
            System.exit(0);
        }
        System.out.print("Entre em com a informação do ano em que estamos: ");
            int ano = tecla.nextInt();
        System.out.println(dia +"/0"+ mes +"/"+ano);
    }
}
