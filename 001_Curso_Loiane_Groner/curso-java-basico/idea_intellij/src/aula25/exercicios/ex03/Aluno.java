package src.aula25.exercicios.ex03;

import java.util.Scanner;

public class Aluno {
	 Scanner key = new Scanner(System.in);
	 String matricula;
	 String nome;
	 String nomeCurso;
	 String[] nomeDisciplinas;
	 double[][] notaDisciplinas;
	 double[] mediaDisciplinas;
	 
	 void solicitarInfomacoes() {
			System.out.print("Informe o número da matrícula: ");
			matricula = key.next();
			
			System.out.print("Informe o nome do aluno: ");
			nome = key.next();
			
			System.out.print("Informe o nome do curso que " + nome + " está matriculado: ");
			nomeCurso = key.next();
			
			nomeDisciplinas = new String[3];
			for (int i = 0; i < nomeDisciplinas.length; i++) { //RECEBENDO O NOME DAS DISCIPLINAS
				 System.out.print("Informe o nome da " + (i + 1) + "º disciplina: ");
				 nomeDisciplinas[i] = key.next();
			}
			
			notaDisciplinas = new double[3][4];
			for (int i = 0; i < notaDisciplinas.length; i++) {// RECEBENDO AS NOTAS
				 System.out.println("Informe as notas da disciplina " + nomeDisciplinas[i]);
				 for (int j = 0; j < notaDisciplinas[i].length; j++) {
						System.out.print("Informe a " + (j + 1) + "º nota: ");
						notaDisciplinas[i][j] = key.nextDouble();
				 }
			}
	 }
	 
	 void apresentarStatus() {
			mediaDisciplinas = new double[4];
			for (int i = 0; i < notaDisciplinas.length; i++) {
				 for (int j = 0; j < notaDisciplinas[i].length; j++) {
						mediaDisciplinas[i] += notaDisciplinas[i][j] / 4;
				 }
			}
			
			System.out.println(" ---- STATUS ---- ");
			System.out.println("Nome do aluno: " + nome);
			System.out.println("Matricula do aluno: " + matricula);
			for (int i = 0; i < notaDisciplinas.length; i++) {
				 System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
				 for (int j = 0; j < notaDisciplinas[i].length; j++) {
						System.out.print(notaDisciplinas[i][j] + " ");
				 }
				 System.out.println();
			}
			for (int i = 0; i < notaDisciplinas.length; i++) {
				 System.out.println("Media da disciplina " + nomeDisciplinas[i] + ": ");
				 System.out.print(mediaDisciplinas[i] + "");
				 System.out.println();
				 if (mediaDisciplinas[i] >= 7) {
						System.out.println("Aluno aprovado.");
				 } else {
						System.out.println("Aluno reprovado.");
				 }
			}
	 }
}
