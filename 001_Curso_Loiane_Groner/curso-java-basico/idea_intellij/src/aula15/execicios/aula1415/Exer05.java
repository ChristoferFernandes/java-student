package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez
 */
public class Exer05 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double nota, nota2, media;
	 System.out.print("Informe a sua primeira nota: ");
	 nota = key.nextDouble();
	 
	 System.out.print("Informe a sua segunda nota: ");
	 nota2 = key.nextDouble();
	 
	 media = (nota + nota2) / 2;
	 if (media == 10) {
		System.out.println("Média do aluno: " + media);
		System.out.println("Aluno aprovado com distinção.");
	 } else if (media >= 7) {
		System.out.println("Média do aluno: " + media);
		System.out.println("Aluno aprovado.");
	 } else {
		System.out.println("Média do aluno: " + media);
		System.out.println("Aluno Reprovado.");
	 }
  }
}
