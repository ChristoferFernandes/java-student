package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a
quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos. */
public class Exer27 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int qtdAlunos, soma, media, qtdTurma;
	 
	 System.out.print("Informe a quantidade de turmas: ");
	 qtdTurma = key.nextInt();
	 
	 soma = 0;
	 for (int i = 1; i <= qtdTurma; i++) {
		System.out.print("Informe a quantidade de alunos na " + i + " turma: ");
		qtdAlunos = key.nextInt();
		
		if (qtdAlunos > 40) {
		  System.out.println("As turmas não podem ter mais de 40 alunos.");
		  System.out.println("Saindo do programa....");
		  System.exit(0);
		}
		soma += qtdAlunos;
	 }
	 media = soma / qtdTurma;
	 System.out.println("A media de alunos por turma é de: " + media);
  }
}
