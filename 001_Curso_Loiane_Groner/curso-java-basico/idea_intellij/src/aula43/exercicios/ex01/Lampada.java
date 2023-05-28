package src.aula25.exercicios.ex01;

public class Lampada {
  boolean ligada;

	void mudarEstado() {
		 if (!ligada) {
				System.out.println("Lampada está Ligada.");
				ligada = true;
		 } else {
				System.out.println("Lampada está Desligada");
				ligada = false;
		 }
	}
}
