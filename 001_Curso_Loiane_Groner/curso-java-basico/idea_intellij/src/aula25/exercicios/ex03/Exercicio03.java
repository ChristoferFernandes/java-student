package src.aula25.exercicios.ex03;

import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Informe a matricula do aluno: ");
		aluno.matricula = key.nextInt();

		System.out.print("Informe o nome do aluno: ");
		aluno.nome = key.next();

		System.out.print("Informe o nome do curso que " + aluno.nome + " está cursando: ");
		aluno.curso = key.next();

			aluno.disciplinas = new String[3];
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Informe o nome da " + (i + 1) + "º disciplina: ");
			aluno.disciplinas[i] = key.next();
		}
			aluno.notasDisciplinas = new double[3];
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.print("Informe a nota da " + (i + 1) + "º disciplina ");
			aluno.notasDisciplinas[i] = key.nextDouble();
		}

		aluno.mostrarResultado();
	}
}
