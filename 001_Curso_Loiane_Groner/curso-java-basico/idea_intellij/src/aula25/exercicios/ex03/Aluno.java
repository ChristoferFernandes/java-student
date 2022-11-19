package src.aula25.exercicios.ex03;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];

	void mostrarResultado() {
		System.out.println("Disciplinas estudadas: ");
		for (String j : disciplinas) {
			System.out.println(j +" ");
		}
		System.out.println();
		System.out.println("Notas das disciplinas: ");
		for (int i = 0; i < notasDisciplinas.length; i++) {
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j]);
			}
			System.out.println();
			}

		System.out.println();
		System.out.println(" ---- Status ---- ");
		for (int i = 0; i < notasDisciplinas.length; i++) {
			for (int j = 0; j < notasDisciplinas[i].length; j++) {
				if (notasDisciplinas[i][j] >= 7) {
					System.out.println("Nota: " + notasDisciplinas[i]);
					System.out.println("Disciplina: " + disciplinas[i]);
					System.out.println(nome +" foi aprovado.");
					System.out.println();
				} else {
					System.out.println("Nota: " + notasDisciplinas[i]);
					System.out.println("Disciplina: " + disciplinas[i]);
					System.out.println(nome +" foi reprovado.");
					System.out.println();
			}
			}
		}
	}
}
