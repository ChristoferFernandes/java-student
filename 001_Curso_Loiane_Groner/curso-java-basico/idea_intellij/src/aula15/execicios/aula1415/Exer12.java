package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS ( 10%) : R$ 110,00
FGTS (11%) : R$ 121,00
Total de descontos : R$ 165,00
Salário Liquido : R$ 935,00
 */
public class Exer12 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double valorHora, fgts, sindicato, salarioLiquido, salarioBruto, impostoRenda, totalDesconto;
	 int horasTrabalhadas, impostoR;
	 
	 System.out.print("Informe quantas horas você trabalhou esse mês: ");
	 horasTrabalhadas = key.nextInt();
	 
	 System.out.print("Informe quanto você ganha a cada hora trabalhada: R$");
	 valorHora = key.nextDouble();
	 
	 salarioBruto = valorHora * horasTrabalhadas;
	 if (salarioBruto <= 900) {
		impostoR = 0;
		impostoRenda = 0;
		sindicato = salarioBruto * 3 / 100;
		fgts = salarioBruto * 11 / 100;
		totalDesconto = impostoRenda + sindicato;
		salarioLiquido = salarioBruto - sindicato;
	 } else if (salarioBruto > 900 && salarioBruto <= 1500) {
		impostoR = 5;
		impostoRenda = salarioBruto * 5 / 100;
		sindicato = salarioBruto * 3 / 100;
		fgts = salarioBruto * 11 / 100;
		totalDesconto = impostoRenda + sindicato;
		salarioLiquido = salarioBruto - sindicato - impostoRenda;
	 } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		impostoR = 10;
		impostoRenda = salarioBruto * 10 / 100;
		sindicato = salarioBruto * 3 / 100;
		fgts = salarioBruto * 11 / 100;
		totalDesconto = impostoRenda + sindicato;
		salarioLiquido = salarioBruto - sindicato - impostoRenda;
	 } else {
		impostoR = 20;
		impostoRenda = salarioBruto * 20 / 100;
		sindicato = salarioBruto * 3 / 100;
		fgts = salarioBruto * 11 / 100;
		totalDesconto = impostoRenda + sindicato;
		salarioLiquido = salarioBruto - sindicato - impostoRenda;
	 }
	 System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + "): R$" + salarioBruto);
	 System.out.println("(-) IR (" + impostoR + "%): R$" + impostoRenda);
	 System.out.println("(-) Sindicato (3%): R$" + sindicato);
	 System.out.println("FGTS (11%): R$" + fgts);
	 System.out.println("Total de descontos: R$" + totalDesconto);
	 System.out.println("Salário Liquído: R$" + salarioLiquido);
  }
}
