package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
 e lhe contraram para desenvolver o programa que calculará os reajustes.
 Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
 critério, baseado no salário atual:
 * os salários até R$ 280,00 (incluindo) : aumento de 20%
 * os salários entre R$ 280,00 e R$ 700,00: aumento de 15%
 * os salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
 * os salários  R$ 1500,00 em diante : aumento de 5% Após o
 * aumento ser realizado, informe na tela:
 * o salário antes do reajuste;
 * o percentual de aumento aplicado;
 * o valor do aumento;
 * o novo salario, após o aumento
 */
public class Exercicio11
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  double salarioBase;
		  double aumento;
		  double novoSalario;
		  int reajuste;
		  
		  System.out.print("Informe o salário do funcionário: R$");
		   salarioBase = tecla.nextDouble();
			
		  if (salarioBase <= 280)
		  {
				reajuste = 20;
				aumento = (salarioBase / 100) * reajuste;
				novoSalario = salarioBase + aumento;
		  }
		  else if (salarioBase > 280 && salarioBase <= 700)
		  {
				reajuste = 15;
				aumento = (salarioBase / 100) * reajuste;
				novoSalario = salarioBase + aumento;
		  }
		  else if (salarioBase > 700 && salarioBase <= 1500)
		  {
				reajuste = 10;
				aumento = (salarioBase / 100) * reajuste;
				novoSalario = salarioBase + aumento;
		  }
		  else
		  {
				reajuste = 5;
				aumento = (salarioBase / 100) * reajuste;
				novoSalario = salarioBase + aumento;
		  }
		  System.out.println("Salario base: R$"+ salarioBase);
		  System.out.println("Percentual do aumento: "+ reajuste +"%");
		  System.out.println("Aumento: R$"+ aumento);
		  System.out.println("Novo salário: R$"+ novoSalario);
	 }
}
