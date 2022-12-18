package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Um posto está vendendo combustíveis com a seguinte tabela de
 * descontos:
 * . Álcool:
 * a. até 20 litros, desconto de 3% por litro
 * b. acima de 20 litros, desconto de 5% por litro
 * Gasolina:
 * c. até 20 litros, desconto de 4% por litro
 * d. acima de 20 litros, desconto de 6% por litro Escreva um
 * algoritmo que leia o número de litros vendidos, o tipo de
 * combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
 * sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
 * do litro do álcool é R$ 1,90
 */
public class Exercicio26
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  char combustivel;
		  double alcool;
		  double valor;
		  double desconto;
		  double total;
		  double gasolina;
		  
		  System.out.println("TABELA DE PREÇOS: ");
		  System.out.println("PREÇO DA GASOLINA: R$2,50 >> PROMOÇÃO DO DIA 4% DE DESCONTO EM ATÉ 20 LITROS, E 6% DE DESCONTO ACIMA DE 20 LITROS.");
		  System.out.println("PREÇO DO ÁLCOOL: R$1,90 >> PROMOÇÃO DO DIA 3% DE DESCONTO EM ATÉ 20 LITROS, E 5% DE DESCONTO ACIMA DE 20 LITROS.");
		  System.out.println("");
		  System.out.print("Você quer Álcool ou Gasolina? [A PARA ALCOOL/ G PARA GASOLINA]: ");
		  combustivel = tecla.next().charAt(0);
		  
		  if(combustivel == 'A' || combustivel == 'a')
		  {
				System.out.print("Quanto você deseja colocar de Alcool? ");
				alcool = tecla.nextDouble();
				
				valor = alcool * 1.90;
				if(alcool <= 20)
				{
					 desconto = valor / 3;
					 total = valor - desconto;
					 System.out.println("");
					 System.out.printf("Em "+ alcool+ " Litros, você vai pagar: R$%.2f",total);
					 
				}
				else if(alcool > 20)
				{
					 desconto = valor / 5;
					 total = valor - desconto;
					 System.out.println("");
					 System.out.printf("Em "+ alcool+ " Litros, você vai pagar: R$%.2f", total);
				}
		  }
		  if(combustivel == 'G' || combustivel == 'g')
		  {
				System.out.print("Quanto você deseja colocar de gasolina? ");
				gasolina = tecla.nextDouble();
				
				valor = gasolina * 2.50;
				if(gasolina <= 20)
				{
					 desconto = valor / 4;
					 total = valor - desconto;
					 System.out.println("");
					 System.out.printf("Em "+ gasolina+" Litros, você vai pagar: R$%2.f",total);
				}
				else if(gasolina > 20)
				{
					 desconto = valor / 6;
					 total = valor - desconto;
					 System.out.println("");
					 System.out.printf("Em "+ gasolina+" Litros, você vai pagar: R$%.2f",total);
				}
		  }
	 }
}
