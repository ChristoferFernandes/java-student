package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de que horário você estuda. M - Matutino / V - Vespertino / N - Noturno: ");
            String horario = tecla.next();

        if(horario.length() > 1){
            System.out.println("Valor Inválido!");
            System.exit(0);
        } else {
            switch (horario){
                case "m":
                case "M":
                    System.out.println("Bom dia!");
                break;
                case "v":
                case "V":
                    System.out.println("Boa tarde!");
                break;
                case "n":
                case "N":
                    System.out.println("Boa noite!");
                break;
                default:
                    System.out.println("Valor Inválido!");
            }
        }
    }
}
