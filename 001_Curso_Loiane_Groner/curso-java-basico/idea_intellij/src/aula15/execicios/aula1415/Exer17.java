package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */
public class Exer17 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int ano;

	System.out.println("Um ano bissexto, é aquele que possui um dia a mais no ano, totalizando 366 dias, e acontece a cada 4 anos.");
	System.out.print("Informe um ano, que você deseja saber se é bissexto ou não: ");
	ano = key.nextInt();

	if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
	  System.out.println(ano + " é um ano Bissexto.");
	} else {
	  System.out.println(ano + " não é um ano Bissexto.");
	}
  }
}
