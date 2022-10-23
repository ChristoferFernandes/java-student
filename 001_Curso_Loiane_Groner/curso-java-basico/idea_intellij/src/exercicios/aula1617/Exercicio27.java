package src.exercicios.aula1617;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int qtdAlunos;
            int soma = 0;
            int media;
        System.out.print("Informe a quantidade de turmas: ");
            int qtdTurma = tecla.nextInt();

        for (int count = 1; count <= qtdTurma; count ++) {
            System.out.print("Informe a quantidade de alunos na "+ count +" turma: ");
                qtdAlunos = tecla.nextInt();

            if(qtdAlunos > 40) {
                System.out.println("As turmas não podem ter mais de 40 alunos.");
                System.out.println("Saindo do programa....");
                System.exit(0);
            }
            soma += qtdAlunos;
        }
        media = soma / qtdTurma;
        System.out.println("A media de alunos por turma é de: "+ media);
    }
}