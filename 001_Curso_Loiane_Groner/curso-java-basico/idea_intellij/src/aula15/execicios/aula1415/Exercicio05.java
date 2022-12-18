package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 Faça um programa para a leitura de duas notas parciais de um aluno.O programa deve
 calcular a média alcançada por aluno e apresentar:
 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * A mensagem "Reprovado", se a média for menor do que sete;
 * A mensagem "Aprovado com Distinção", se a média for igual a dez;
 */
public class Exercicio05
{
	 public static void main(String[] args)
	 {
		  Scanner key = new Scanner(System.in);
		  
		  double nota1;
		  double nota2;
		  double media;
		  
		  System.out.print("Entre com a informação a primeira nota do aluno: ");
		  nota1 = key.nextDouble();
		  
		  System.out.print("Entre com a informação a primeira nota do aluno: ");
		  nota2 = key.nextDouble();
		  
		  media = (nota1 + nota2) / 2; //CALCULO MATEMÁTICO
		  System.out.println("A média do aluno é de: "+ media);
		  
		  if (media == 10)
		  {
				System.out.println("Aprovado com Distinção.");
		  }
		  else if(media >= 7 && media < 10)
		  {
				System.out.println("Aprovado.");
		  }
		  else
		  {
				System.out.println("Reprovado.");
		  }
	 }
}
