package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	int par = 0, impar = 0;
	for (int count = 1; count <= 10; count++) {
	  System.out.print("Informe o " + count + "º valor: ");
	  int valor = tecla.nextInt();

	  if (valor % 2 == 0) {
		par++;
	  } else {
		impar++;
	  }
	}
	System.out.println("Valores PAR: " + par);
	System.out.println("Valores IMPAR: " + impar);
  }
}
