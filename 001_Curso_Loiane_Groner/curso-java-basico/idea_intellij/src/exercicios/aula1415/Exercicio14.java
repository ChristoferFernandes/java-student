package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação da primeira nota do aluno: ");
            double nota = tecla.nextDouble();
        System.out.print("Entre com a informação da primeira nota do aluno: ");
            double nota2 = tecla.nextDouble();

            double media = (nota + nota2) / 2;
            char conceito;
            String mensagem;
        if(media >= 0 && media <= 4){
            conceito = 'E';
            mensagem = "REPROVADO!";
        } else if (media > 4 && media <= 6){
            conceito = 'D';
            mensagem = "REPROVADO!";
        } else if (media > 6 && media <= 7.5){
            conceito = 'C';
            mensagem = "APROVADO!";
        } else if (media > 7.5 && media <= 9){
            conceito = 'B';
            mensagem = "APROVADO!";
        } else {
            conceito = 'A';
            mensagem = "APROVADO!";
        }
        System.out.println("Média do aluno: "+ media);
        System.out.println("Aproveitamento: "+conceito);
        System.out.println(mensagem);
    }
}
