package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double[] notas1 = new double[10];
	 double[] notas2 = new double[notas1.length];
	 double[] resultados = new double[notas1.length];
	 double soma = 0;
	 
	 for (int count = 0; count < notas1.length; count++) {
		System.out.print("Informe a primeira nota do " + (count + 1) + "º aluno: ");
		notas1[count] = key.nextDouble();
		System.out.print("Informe a segunda nota: ");
		notas2[count] = key.nextDouble();
	 }
	 for (int count = 0; count < resultados.length; count++) {
		soma = notas1[count] + notas2[count];
		resultados[count] = soma / 2;
		System.out.println("Media do " + (count + 1) + "º aluno: " + resultados[count]);
	 }
	 System.out.println("--- STATUS ---");
	 for (int count = 0; count < resultados.length; count++) {
		if (resultados[count] < 7) {
		  System.out.println((count + 1) + "º Aluno Reprovado.");
		}
		System.out.println((count + 1) + "º Aluno Aprovado.");
	 }
  }
}
