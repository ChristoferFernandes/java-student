package src.aula13.execicios.aulas131211;
/*
Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */

import java.util.Scanner;

public class Exer12 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	double altura, pesoIdeal;

	System.out.print("Informe a sua altura: ");
	altura = key.nextDouble();

	pesoIdeal = (72.7 * altura) - 58;

	System.out.println("Com base na sua altura, seu peso ideal é: " + pesoIdeal);
  }
}
