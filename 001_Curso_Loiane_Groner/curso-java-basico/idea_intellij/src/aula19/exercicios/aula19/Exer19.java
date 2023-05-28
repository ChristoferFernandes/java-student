package src.aula19.exercicios.aula19;

import java.util.Scanner;
/* Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores “Nota1” e
 “Nota2” do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o
 resultado em um vetor “Result” de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno.
 Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno será
“reprovado” */
public class Exer19 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double[] notas1 = new double[10];
	 double[] notas2 = new double[notas1.length];
	 double[] resultados = new double[notas1.length];
	 double soma;
	 
	 for (int count = 0; count < notas1.length; count++) {
		System.out.print("Informe a primeira nota do " + (count + 1) + "º aluno: ");
		notas1[count] = key.nextDouble();
		System.out.print("Informe a segunda nota: ");
		notas2[count] = key.nextDouble();
	 }
	 soma = 0;
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
