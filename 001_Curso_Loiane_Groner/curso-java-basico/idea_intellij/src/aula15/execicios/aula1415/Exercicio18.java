package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que peça uma data no formato dd/mm/aaaa e
 * determine se a mesma é uma data válida.
 */
public class Exercicio18
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int dia;
		  int fevereiro;
		  int mes;
		  int ano;
		  System.out.print("Informe o dia em que estamos: ");
		  dia = tecla.nextInt();
		  
		  fevereiro = dia;
		  if(dia < 1 || dia > 31 )
		  {
				System.out.println(dia + " Não corresponde a um dia válido.");
				System.exit(0);
		  }
		  System.out.print("Informe o  mês em que estamos: ");
		  mes = tecla.nextInt();
		  
		  if(mes < 0 || mes > 12)
		  {
				System.out.println(mes+ " Não corresponde a um mês válido.");
				System.exit(0);
		  }
		  if (mes == 2)
		  {
				if(dia > 28)
				{
					 System.out.println (dia +" Não corresponde a um dia do mês de fevereiro válido.");
					 System.exit(0);
				}
		  }
		  System.out.print("Informe o ano em que estamos: ");
		  ano = tecla.nextInt();
		  
		  System.out.println(dia +"/0"+ mes +"/"+ano);
	 }
}
