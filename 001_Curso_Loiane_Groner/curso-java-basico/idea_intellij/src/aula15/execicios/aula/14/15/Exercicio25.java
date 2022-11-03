package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("Você está sendo investigado por assassinato, responda as perguntas abaixo, caso contrário será preso.");

        int resposta = 0;

        System.out.print("Telefonou para a vitima?  [S/N]: ");
        char pergunta1 = tecla.next().charAt(0);
        if(pergunta1 == 'S' || pergunta1 == 's'){
            resposta = ++resposta;
        }
        System.out.print("Esteve no local do crime? [S/N]: ");
        char pergunta2 = tecla.next().charAt(0);
        if(pergunta2 == 'S' || pergunta2 == 's'){
            resposta = ++resposta;
        }
        System.out.print("Mora perto da vítima? [S/N]: ");
        char pergunta3 = tecla.next().charAt(0);
        if(pergunta3 == 'S' || pergunta3 == 's'){
            resposta = ++resposta;
        }
        System.out.print("Devia para a vítima? [S/N]: ");
        char pergunta4 = tecla.next().charAt(0);
        if(pergunta4 == 'S' || pergunta4 == 's'){
            resposta = ++resposta;
        }
        System.out.print("Já trabalhou com a vítima? [S/N]: ");
        char pergunta5 = tecla.next().charAt(0);
        if(pergunta5 == 'S' || pergunta5 == 's'){
            resposta = ++resposta;
        }
        switch (resposta){
            case 1:
            default:
                System.out.println("Parece que você é inocente.");
                break;
            case 2:
                System.out.println("Você é suspeito, não saia da cidade!");
                break;
            case 3:
            case 4:
                System.out.println("Você está sendo preso como CUMPLICE DO CRIME. MÃOS PARA O ALTO SEU MARGINAL");
                break;
            case 5:
                System.out.println("Você está sendo preso seu ASSASSINO. MÃOS PARA O ALTO SEU MARGINAL");
                break;
        }
    }
}

