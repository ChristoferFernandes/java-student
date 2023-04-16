package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	int count = 0;
	double valor, resultado = Integer.MIN_VALUE;

	while (count <= 5) {
	  System.out.print("Informe um número: ");
	  valor = tecla.nextDouble();
	  if (valor > resultado) {
		resultado = valor;
	  }
	  count++;
	}
	System.out.println("O maior valor digitado foi: " + resultado);
  }
}
