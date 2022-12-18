package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
 * sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 * salário bruto.
 a. quanto pagou ao INSS.
 b. quanto pagou ao sindicato.
 c. o salário líquido.
 d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
 + Salário Bruto : R$ - IR (11%) : R$ - INSS  (8%) : R$ - Sindicato ( 5%) : R$ = SalárioLiquido : R$
 Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
public class Exercicio13
{
	public static void main(String[] args)
	{
		Scanner tecla = new Scanner(System.in);
		
		double valorHora;
		double horasTrabalhadas;
		double salarioBruto;
		double ImpostoRenda;
		double INSS;
		double sindicato;
		double descontos;
		double salarioFinal;
		
		System.out.print("Entre com a informação de quanto você ganha por hora: R$");
		valorHora = tecla.nextDouble();
			
		System.out.print("Entre com a informação de quantas hotas você trabalha por mês: ");
		horasTrabalhadas = tecla.nextDouble();
			
		salarioBruto = valorHora * horasTrabalhadas;
		ImpostoRenda = (salarioBruto / 100) * 11;
		INSS = (salarioBruto / 100) * 8;
		sindicato = (salarioBruto / 100) * 5;
		descontos = ImpostoRenda + INSS + sindicato;
		salarioFinal = salarioBruto - descontos;
	
		System.out.println("Status: ");
		System.out.println ();
		System.out.println("Salario Bruto: R$"+ salarioBruto);
		System.out.println("Imposto de Renda (-11%): R$"+ ImpostoRenda);
		System.out.println("INSS (-8%): R$"+ INSS);
		System.out.println("sindicato (-5%): R$"+ sindicato);
		System.out.println("Total de descontos: R$"+ descontos);
		System.out.println("Salario Líquido: R$"+ salarioFinal);
	
	}
}
