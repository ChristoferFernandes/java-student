package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	int media;
	int soma = 0;
	int nota;
	System.out.print("Informe o valor da média: ");
	int num = tecla.nextInt();


	for (int count = 0; count < num; count++) {
	  System.out.print("Informe o valor da nota: ");
	  nota = tecla.nextInt();

	  if (nota < 0 || nota > 10) {
		System.out.println("Você só pode informar notas de 0 a 10.");
		System.out.println("Saindo do programa...");
		break;
	  }
	  soma += nota;
	}
	media = soma / num;
	System.out.println("A média aritmética é: " + media);
  }
}
