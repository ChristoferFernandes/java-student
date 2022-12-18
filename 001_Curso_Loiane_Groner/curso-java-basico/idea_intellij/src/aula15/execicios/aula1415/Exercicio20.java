package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação da primeira  nota do aluno: ");
            double nota = tecla.nextDouble();
        System.out.print("Entre com a informação da primeira  nota do aluno: ");
        double nota2 = tecla.nextDouble();
        System.out.print("Entre com a informação da primeira  nota do aluno: ");
        double nota3 = tecla.nextDouble();

        double media = (nota + nota2 + nota3) / 3;
        if(media == 10){
            System.out.println("APROVADO COM DISTINÇÃO!");
        }else if(media >= 7){
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }
    }
}
