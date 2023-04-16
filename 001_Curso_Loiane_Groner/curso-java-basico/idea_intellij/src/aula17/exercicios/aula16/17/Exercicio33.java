package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio33 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	double tempMaior = Double.MIN_VALUE;
	double tempMenor = Double.MAX_VALUE;
	double temperatura;
	double soma = 0;
	double media;

	System.out.print("Entre com a informação da quantidade de temperaturas: ");
	int qtdTemperatura = tecla.nextInt();

	for (int count = 1; count <= qtdTemperatura; count++) {
	  System.out.print("Entre com a Informação da " + count + "º temperatura: ");
	  temperatura = tecla.nextDouble();

	  if (temperatura > tempMaior) {
		tempMaior = temperatura;
	  }
	  if (temperatura < tempMenor) {
		tempMenor = temperatura;
	  }
	  soma = soma + temperatura;

	}
	media = soma / qtdTemperatura;
	System.out.println("A maior temperatura informada foi de " + tempMaior + "º");
	System.out.println("A menor temperatura informada foi de " + tempMenor + "º");
	System.out.println("A média das temperaturas digitadas foi de " + media + "º");
  }
}
