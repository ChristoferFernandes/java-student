package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */
public class Exer19 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int num, centena, dezena, unidade;

	System.out.print("Informe um número que seja menor que 1.000: ");
	num = key.nextInt();

	centena = num / 100;
	dezena = (num % 100) / 10;
	unidade = (num % 100 % 10);

	if (num >= 100) {
	  System.out.println(num + " = " + centena + " centenas, " + dezena + " dezenas, " + unidade + " unidades.");
	} else if (num >= 10) {
	  System.out.println(num + " = " + dezena + " dezenas, " + unidade + " unidades.");
	} else {
	  System.out.println(num + " = " + unidade + " unidades.");
	}
  }

}
