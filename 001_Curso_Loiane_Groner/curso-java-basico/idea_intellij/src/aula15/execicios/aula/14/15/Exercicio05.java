package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação a primeira nota do aluno: ");
            double nota1 = tecla.nextDouble();
        System.out.print("Entre com a informação a primeira nota do aluno: ");
            double nota2 = tecla.nextDouble();

            double media = (nota1 + nota2) / 2;
        if (media == 10){
            System.out.println("Aprovado com Distinção.");
        } else if(media >= 7 && media < 10){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
