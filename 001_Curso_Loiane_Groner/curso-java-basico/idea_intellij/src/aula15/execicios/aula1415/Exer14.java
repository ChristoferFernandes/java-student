package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
public class Exer14 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			double nota, nota2, media;
			String conceito, aprovacao;
			
			System.out.print("Informe a nota do 1º bimestre: ");
			nota = key.nextDouble();
			
			System.out.print("Informe a nota do 2º bimestre: ");
			nota2 = key.nextDouble();
			
			media = (nota + nota2) / 2;
			if (media >= 9 && media <= 10) {
				 conceito = "A";
				 aprovacao = "Aprovado.";
			} else if (media >= 7.5 && media < 9) {
				 conceito = "B";
				 aprovacao = "Aprovado.";
			} else if (media >= 6 && media < 7.5) {
				 conceito = "C";
				 aprovacao = "Aprovado.";
			} else if (media >= 4 && media < 6) {
				 conceito = "D";
				 aprovacao = "Reprovado.";
			} else {
				 conceito = "E";
				 aprovacao = "Reprovado.";
			}
			System.out.println("Notas: " + nota + ", " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("Resultado: " + aprovacao);
	 }
}
