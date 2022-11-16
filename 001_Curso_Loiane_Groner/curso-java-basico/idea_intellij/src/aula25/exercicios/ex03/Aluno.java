package src.aula25.exercicios.ex03;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	String[] disciplinas;
	double[] notasDisciplinas;

	void mostrarResultado() {
		System.out.println("Disciplinas estudadas: ");
		for (String j : disciplinas) {
			System.out.println(j +" ");
		}
		System.out.println();
		System.out.println("Notas das disciplinas: ");
		for (double k: notasDisciplinas) {
			System.out.println(k +" ");
		}

		System.out.println();
		System.out.println(" ---- Status ---- ");
		for (int i = 0; i < notasDisciplinas.length; i++) {
			if (notasDisciplinas[i] >= 7) {
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
