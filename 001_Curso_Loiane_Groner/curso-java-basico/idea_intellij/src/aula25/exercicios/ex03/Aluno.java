package src.aula25.exercicios.ex03;

import java.util.Scanner;
public class Aluno {
	Scanner key = new Scanner(System.in);
	String nome;
	int matricula;
	String curso;
	String[] disciplina = new String[3];
	double[] notaDisciplina = new double[3];

	void iniciarPeguntas() {
		System.out.print("Informe a matricula do aluno: ");
		matricula = key.nextInt();

		System.out.print("Informe o nome do aluno: ");
		nome = key.next();

		System.out.print("Informe o nome do curso que " + nome + " está cursando: ");
		curso = key.next();

		for (int i = 0; i < disciplina.length; i++) {
			System.out.print("Informe o nome da " + (i + 1) + "º disciplina: ");
			disciplina[i] = key.next();
		}

		for (int i = 0; i < notaDisciplina.length; i++) {
			System.out.print("Informe a nota da " + (i + 1) + "º disciplina ");
			notaDisciplina[i] = key.nextDouble();
		}
	}

	void mostrarResultado() {
		System.out.println("Disciplinas estudadas: ");
		for (String j : disciplina) {
			System.out.println(j +" ");
		}
		System.out.println();
		System.out.println("Notas das disciplinas: ");
		for (double k: notaDisciplina) {
			System.out.println(k +" ");
		}

		System.out.println();
		System.out.println(" ---- Status ---- ");
		for (int i = 0; i < notaDisciplina.length; i++) {
			if (notaDisciplina[i] >= 7) {
				System.out.println("Nota: " + notaDisciplina[i]);
				System.out.println("Disciplina: " + disciplina[i]);
				System.out.println(nome +" foi aprovado.");
				System.out.println();
			} else {
				System.out.println("Nota: " + notaDisciplina[i]);
				System.out.println("Disciplina: " + disciplina[i]);
				System.out.println(nome +" foi reprovado.");
				System.out.println();
			}
		}
	}
}
