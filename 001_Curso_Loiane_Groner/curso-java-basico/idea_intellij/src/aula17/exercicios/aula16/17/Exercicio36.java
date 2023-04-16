package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio36 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	int resultado;
	System.out.print("Montar a tabuada de: ");
	int tabuada = tecla.nextInt();
	System.out.print("Começa por: ");
	int comeca = tecla.nextInt();
	System.out.print("Termina por: ");
	int termina = tecla.nextInt();

	if (termina < comeca) {
	  System.out.println("Tabuada inválida, valor final não pode ser menor que o final.");
	  System.out.println("Saindo do programa...");
	  System.exit(0);
	}

	System.out.println();
	System.out.println("Vou montar uma tabuada de " + tabuada + " que começa com " + comeca + " e termina com " + termina + ".");

	for (int count = comeca; count <= termina; count++) {
	  resultado = tabuada * count;
	  System.out.println(tabuada + " * " + count + " = " + resultado);
	}
  }
}
