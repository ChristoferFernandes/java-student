package src.aula13.execicios.aulas131211;
/*
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
import java.util.Scanner;

public class Exer14 {
	 public static void main(String[] args) {
		  Scanner key = new Scanner(System.in);

		  double salarioHora, horasTrabalhadas, salarioBruto,inss,sindicato,impostoRenda;

		  System.out.print("Quanto você ganha por hora? R$: ");
		  salarioHora = key.nextDouble();

		  System.out.print("Quantas horas você trabalha durante o mês? ");
		  horasTrabalhadas = key.nextDouble();

		  salarioBruto = salarioHora * horasTrabalhadas;
		  impostoRenda = salarioBruto * 11 / 100;
		  inss = salarioBruto * 8 / 100;
		  sindicato = salarioBruto * 5 / 100;

		  System.out.println("Salario Bruto: R$"+ salarioBruto);
		  System.out.println("Imposto de renda (-11%): R$"+ impostoRenda);
		  System.out.println("INSS (-8%): R$"+ inss);
		  System.out.println("Sindicato (-5%): R$"+ sindicato);
		  System.out.println("Salário Líquido: R$"+ (salarioBruto - impostoRenda - inss - sindicato));
	 }
}
