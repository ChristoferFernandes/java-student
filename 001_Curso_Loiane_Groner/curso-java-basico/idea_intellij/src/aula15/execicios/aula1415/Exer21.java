package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
O valor mínimo é de 10 reais e o máximo de 600 reais.
O programa não deve se preocupar com a quantidade de notas existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1
 */
public class Exer21 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int saque, c100, c50, c10, c5, c1;

	System.out.println("NOTAS DISPONIVEIS: R$1,00 R$5,00 R$10,00 R$50,00 R$100,00");
	System.out.println("Você só pode sacar a partir de R$10,00 e o máximo de R$600,00");

	System.out.print("Quanto você quer sacar? R$ ");
	saque = key.nextInt();

	if (saque < 10 || saque > 600) {
	  System.out.println("Saque inválido: Só pode sacar a partir de R$10,00 até R$600,00");
	  System.exit(0);
	}
	c100 = saque / 100;
	saque = saque % 100;
	c50 = saque / 50;
	saque = saque % 50;
	c10 = saque / 10;
	saque = saque % 10;
	c5 = saque / 5;
	saque = saque % 5;
	c1 = saque;
	saque = 0;

	System.out.println("IMPRIMINDO... ");
	System.out.println("R$100 = " + c100 + ", R$50 = " + c50 + ", R$10 = " + c10 + ", R$5 = " + c5 + ", R$1 = " + c1);
  }
}
