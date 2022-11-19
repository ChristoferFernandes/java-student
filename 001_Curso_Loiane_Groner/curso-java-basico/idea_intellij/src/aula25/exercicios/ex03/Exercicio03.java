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

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.print("Informe o nome da " + (i + 1) + "º disciplina: ");
			aluno.disciplinas[i] = key.next();
		}
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.print("Recebendo as notas da disciplina "+ aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe quanto você tirou na "+ (j + 1) +"º nota: ");
					aluno.notasDisciplinas[i][j] = key.nextDouble();
			}
		}

		aluno.mostrarResultado();
	}
}
