package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
As Organizações Tabajara resolveram dar um aumento de salário aosseus colaboradores e lhe contraram para desenvolver
o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */
public class Exer11 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double salarioAtual, percentual, aumento, salarioAumento;
	 
	 System.out.print("Informe o seu salário atual R$: ");
	 salarioAtual = key.nextDouble();
	 
	 if (salarioAtual <= 280) {
		percentual = 20;
		aumento = (salarioAtual * 20) / 100;
		salarioAumento = aumento + salarioAtual;
	 } else if (salarioAtual > 280 && salarioAtual <= 700) {
		percentual = 15;
		aumento = (salarioAtual * 15) / 100;
		salarioAumento = aumento + salarioAtual;
	 } else if (salarioAtual > 700 && salarioAtual <= 1500) {
		percentual = 10;
		aumento = (salarioAtual * 10) / 100;
		salarioAumento = aumento + salarioAtual;
	 } else {
		percentual = 5;
		aumento = (salarioAtual * 5) / 100;
		salarioAumento = aumento + salarioAtual;
	 }
	 
	 System.out.println("Seu salário antes do reajuste: R$" + salarioAtual);
	 System.out.println("O percentual de aumento do seu salário: " + percentual + "%");
	 System.out.println("O valor do aumento que você recebeu: R$" + aumento);
	 System.out.println("O valor do seu salário após o reajuste: R$" + salarioAumento);
  }
}
