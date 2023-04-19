package src.aula17.exerciciosaula1617;

import java.util.Scanner;
import java.text.DecimalFormat;

/*Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que
o usuário digite o salário inicial do funcionário. */
public class Exer37 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 DecimalFormat decimalF = new DecimalFormat("###,###.##");
	 
	 double percentual, salarioAtual, soma, salario;
	 
	 System.out.print("Informe o salário inicial: R$");
	 salario = key.nextDouble();
	 
	 percentual = 1.5;
	 System.out.println("Salário em 1995 é de R$" + decimalF.format(salario));
	 salarioAtual = (salario / 100) * percentual;
	 soma = salario + salarioAtual;
	 System.out.println("Saláro em 1996 é de R$" + decimalF.format(soma));
	 
	 for (int i = 1997; i <= 2023; i++) {
		percentual *= 2;
		salarioAtual = (salario / 100) * percentual;
		soma += salarioAtual;
		System.out.println("Salario em " + i + " é de R$" + decimalF.format(soma));
	 }
  }
}
