package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões
ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como "Inocente"
 */
public class Exer25 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int resposta = 0;
	char pergunta, pergunta2, pergunta3, pergunta4, pergunta5;

	System.out.println("Você está sendo investigado por assassinato, responda as perguntas abaixo, caso contrário será preso.");

	System.out.print("Telefonou para a vitima?  [S/N]: ");
	pergunta = key.next().charAt(0);

	if (pergunta == 'S' || pergunta == 's') {
	  ++resposta;
	}

	System.out.print("Esteve no local do crime? [S/N]: ");
	pergunta2 = key.next().charAt(0);

	if (pergunta2 == 'S' || pergunta2 == 's') {
	  ++resposta;
	}

	System.out.print("Mora perto da vítima? [S/N]: ");
	pergunta3 = key.next().charAt(0);

	if (pergunta3 == 'S' || pergunta3 == 's') {
	  ++resposta;
	}

	System.out.print("Devia para a vítima? [S/N]: ");
	pergunta4 = key.next().charAt(0);

	if (pergunta4 == 'S' || pergunta4 == 's') {
	  ++resposta;
	}

	System.out.print("Já trabalhou com a vítima? [S/N]: ");
	pergunta5 = key.next().charAt(0);

	if (pergunta5 == 'S' || pergunta5 == 's') {
	  ++resposta;
	}

	switch (resposta) {
	  case 1:
		System.out.println("Parece que você é inocente.");
		break;
	  case 2:
		System.out.println("Você é suspeito, não saia da cidade!");
		break;
	  case 3:
	  case 4:
		System.out.println("Você está sendo preso como CUMPLICE DO CRIME. MÃOS PARA O ALTO SEU MARGINAL");
		break;
	  case 5:
		System.out.println("Você está sendo preso seu ASSASSINO. MÃOS PARA O ALTO SEU MARGINAL");
		break;
	}
  }
}
