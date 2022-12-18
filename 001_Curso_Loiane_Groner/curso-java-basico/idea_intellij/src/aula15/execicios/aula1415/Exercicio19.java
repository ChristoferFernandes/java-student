package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que leia um número inteiro menor que 1000 e
 * imprima a quantidade de centenas, dezenas e unidades do mesmo.
 * o Observando os termos no plural a colocação do "e", da vírgula
 * entre outros. Exemplo:
 * o 326 = 3 centenas, 2 dezenas e 6 unidades
 * o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
 * 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */
public class Exercicio19
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int valor;
		  int centena;
		  int dezena;
		  int unidade;
		  
		  System.out.print("Informe um número abaixo de 1.000: ");
		  valor = tecla.nextInt();
		  
		  centena = valor / 100;
		  dezena = (valor % 100) / 10;
		  unidade = (valor % 100 % 10);
		  
		  if (valor >= 100)
		  {
				System.out.println(valor + " = " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");
		  }
		  else if (valor >= 10)
		  {
				System.out.println(valor + " = "+ dezena + " dezenas e " + unidade + " unidades.");
		  }
		  else
		  {
				System.out.println(valor+" = "+unidade+" unidades.");
		  }
	 }
}

