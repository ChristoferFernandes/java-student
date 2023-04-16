package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média
 */

import java.util.Scanner;

public class Exer04 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	double nota, nota2, nota3, nota4, media;

	System.out.print("Informe a nota do 1º bimestre: ");
	nota = key.nextDouble();

	System.out.print("Informe a nota do 2º bimestre: ");
	nota2 = key.nextDouble();

	System.out.print("Informe a nota do 3º bimestre: ");
	nota3 = key.nextDouble();

	System.out.print("Informe a nota do 4º bimestre: ");
	nota4 = key.nextDouble();

	media = (nota + nota2 + nota3 + nota4) / 4;

	System.out.println("A média das 4 notas do aluno é de: " + media);
  }
}
