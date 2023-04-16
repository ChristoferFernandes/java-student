package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	int potencia = 0;

	System.out.print("Informe um número inteiro: ");
	int valor = tecla.nextInt();
	System.out.print("Informe um número para potência: ");
	int valor2 = tecla.nextInt();

	for (int count = 1; count < valor2; count++) {
	  potencia += valor * valor;
	  System.out.println(potencia);
	}
  }
}
