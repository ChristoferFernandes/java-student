package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um programa para o cálculo de uma folha de pagamento,
 * sabendo que os descontos são do Imposto de Renda, que depende do
 * salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
 * FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
 * a empresa que deposita). O Salário Líquido corresponde ao Salário
 * Bruto menos os descontos. O programa deverá pedir ao usuário o
 * valor da sua hora e a quantidade de horas trabalhadas no mês.
 * o Desconto do IR:
 * o Salário Bruto até 900 (inclusive) - isento
 * o Salário Bruto até 1500 (inclusive) - desconto de 5%
 * o Salário Bruto até 2500 (inclusive) - desconto de 10%
 * o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
 * as informações, dispostas conforme o exemplo abaixo. No
 * exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * Salário Bruto: (5 * 220) : R$ 1100,00
 * (-) IR (5%) : R$ 55,00
 * (-) INSS ( 10%) : R$ 110,00
 * FGTS (11%) : R$ 121,00
 * Total de descontos : R$ 165,00
 * Salário Liquido : R$ 935,00
 */
public class Exercicio12
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  double valorHora;
		  int horaTrabalhada;
		  double salarioBruto = 0;
		  double INSS;
		  double FGTS = 0;
		  double totalDescontos = 0;
		  double salarioLiquido = 0;
		  double impostoRenda = 0;
		  double percentual = 0;
		  
		  
		  System.out.print("Informe o quanto você ganha por hora: R$");
		  valorHora = tecla.nextDouble();
		  
		  System.out.print("Informe o  quanto você trabalhou esse mês: ");
		  horaTrabalhada = tecla.nextInt();
		  
		  salarioBruto = valorHora * horaTrabalhada;
		  INSS = (salarioBruto / 100) * 10;
		  FGTS = (salarioBruto / 100) * 11;
		  
		  if (salarioBruto <= 900)
		  {
				totalDescontos = impostoRenda + INSS;
				salarioLiquido = salarioBruto - totalDescontos;
		  }
		  else if (salarioBruto > 900 && salarioBruto <= 1500)
		  {
				percentual = 5;
				impostoRenda = (salarioBruto / 100) * percentual;
				totalDescontos = impostoRenda + INSS;
				salarioLiquido = salarioBruto - totalDescontos;
		  }
		  else if (salarioBruto > 1500 && salarioBruto <= 2500)
		  {
				percentual = 10;
				impostoRenda = (salarioBruto / 100) * percentual;
				totalDescontos = impostoRenda + INSS;
				salarioLiquido = salarioBruto - totalDescontos;
		  } else if( salarioBruto > 2500){
				percentual = 20;
				impostoRenda = (salarioBruto / 100) * percentual;
				totalDescontos = impostoRenda + INSS;
		  }
		  System.out.println("Sálario Bruto: ("+ valorHora +" * "+ horaTrabalhada +") :  R$"+salarioBruto);
		  System.out.println("(-) Imposto de Renda ("+ percentual +"):  R$"+impostoRenda);
		  System.out.println("FGTS (11%):  R$"+ FGTS);
		  System.out.println("Total de Descontos:  R$"+ totalDescontos);
		  System.out.println("Salário Líquido:  R$"+ salarioLiquido);
	 }
}
