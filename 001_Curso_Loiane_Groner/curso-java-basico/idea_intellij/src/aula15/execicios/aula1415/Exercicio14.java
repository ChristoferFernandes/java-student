package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número e exiba o dia correspondente
 * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
 * aparecer valor inválido
 * o Média de Aproveitamento Conceito
 * o Entre 9.0 e 10.0 A
 * o Entre 7.5 e 9.0 B
 * o Entre 6.0 e 7.5 C
 * o Entre 4.0 e 6.0 D
 * o Entre 4.0 e zero E
 
 * O algoritmo deve mostrar na tela as notas, a média, o conceito
 * correspondente e a mensagem “APROVADO” se o conceito for
 * A, B ou C ou “REPROVADO” se o conceito for D ou E
 */
public class Exercicio14
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  double nota;
		  double nota2;
		  double media;
		  String mensagem;
		  char conceito;
		  
		  System.out.print("Informe a primeira nota do aluno: ");
		  nota = tecla.nextDouble();
		  
		  System.out.print("Informe a segunda nota do aluno: ");
		  nota2 = tecla.nextDouble();
		  
		  media = (nota + nota2) / 2;
		  
		  if(media >= 0 && media <= 4)
		  {
				conceito = 'E';
				mensagem = "REPROVADO!";
		  }
		  else if (media > 4 && media <= 6)
		  {
				conceito = 'D';
				mensagem = "REPROVADO!";
		  }
		  else if (media > 6 && media <= 7.5)
		  {
				conceito = 'C';
				mensagem = "APROVADO!";
		  }
		  else if (media > 7.5 && media <= 9)
		  {
				conceito = 'B';
				mensagem = "APROVADO!";
		  }
		  else
		  {
				conceito = 'A';
				mensagem = "APROVADO!";
		  }
		  System.out.println("Média do aluno: "+ media);
		  System.out.println("Aproveitamento: "+conceito);
		  System.out.println(mensagem);
	 }
}
