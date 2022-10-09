package src.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Entre com a informação de um dia da semana (1-7): ");
            int semana = tecla.nextInt();
        switch (semana){
            case 1:
                System.out.println("DOMINGO!");
                break;
            case 2:
                System.out.println("SEGUNDA-FEIRA!");
                break;
            case 3:
                System.out.println("TERÇA-FEIRA!");
                break;
            case 4:
                System.out.println("QUARTA-FEIRA!");
                break;
            case 5:
                System.out.println("SEXTA-FEIRA!");
                break;
            case 7:
                System.out.println("SÁBADO!");
                break;
            default:
                System.out.println("Não é uma opção válida.");
        }
    }
}

