package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 *                  Até 5 Kg                     Acima de 5 Kg
 * Morango     R$ 2,50 por Kg             R$ 2,20 por Kg
 * Maçã R$     R$ 1,80 por Kg             R$ 1,50 por Kg
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
 * compra ultrapassar R$ 25,00, receberá ainda um desconto de
 * 10% sobre este total. Escreva um algoritmo para ler a
 * quantidade (em Kg) de morangos e a quantidade (em Kg) de
 * maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
public class Exercicio27
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int opcao;
		  double morango;
		  double maca;
		  double valor;
		  double desconto;
		  double total;
		  
		  System.out.println("[1]- Para comprar Morangos ");
		  System.out.println("[2]- Para comprar Maçãs ");
		  System.out.println("[3]- Para comprar as duas frutas");
		  opcao = tecla.nextInt();
		  
		  switch (opcao)
		  {
				case 1:
					 System.out.print("Quantos KG de morango você quer comprar?: ");
					 morango = tecla.nextDouble();
					 
					 if (morango <= 5)
					 {
						  System.out.println("Você está pagando R$2,50 por kg do morango.");
						  valor = morango * 2.50;
						  System.out.println("Você comprou " + morango + " kg de morango e vai pagar R$" + valor);
						  desconto = valor / 10;
						  total = valor - desconto;
					 }
					 else if (morango > 5)
					 {
						  System.out.println("Você está pagando R$2,20 por kg do morango.");
						  valor = morango * 2.20;
						  System.out.println("Você comprou " + morango + " kg de morango e vai pagar R$" + valor);
						  if (morango > 8 || valor > 25)
						  {
								desconto = valor / 10;
								total = valor - desconto;
								System.out.print("Você comprou mais de 8kg de morango ou acima de R$25,00 e por isso ganhou 10% de desconto");
								System.out.printf("e por isso vai pagar R$%.2f", total);
						  }
					 }
					 break;
				case 2:
					 System.out.print("Quantos kg de maçã você quer comprar?: ");
					 maca = tecla.nextDouble();
					 
					 if (maca <= 5)
					 {
						  System.out.println("Você está pagando R$1,80 por kg da maçã.");
						  valor = maca * 1.80;
						  System.out.println("Você comprou " + maca + " kg de maçã e vai pagar R$" + valor);
						  desconto = valor / 10;
						  total = valor - desconto;
						  
					 }
					 else if (maca > 5)
					 {
						  System.out.println("Você está pagando R$1,50 por kg da maçã.");
						  valor = maca * 1.50;
						  System.out.println("Você comprou " + maca + " kg de morango e vai pagar R$" + valor);
						  if (maca > 8 || valor > 25)
						  {
								desconto = valor / 10;
								total = valor - desconto;
								System.out.print("Você comprou mais de 8kg de maçã ou acima de R$25,00 e por isso ganhou 10% de desconto");
								System.out.printf("e por isso vai pagar R$%.2f", total);
						  }
					 }
					 break;
				case 3:
					 System.out.print("Quantos kg de das frutas você quer?: ");
					 double frutas = tecla.nextDouble();
					 
					 if (frutas <= 5)
					 {
						  System.out.println("Você está pagando R$4,30 por kg das frutas.");
						  valor = frutas * 4.30;
						  System.out.println("Você comprou " + frutas + " kg de frutas e vai pagar R$" + valor);
						  desconto = valor / 10;
						  total = valor - desconto;
					 }
					 else if (frutas > 5)
					 {
						  System.out.println("Você está pagando R$1,50 por kg da maçã.");
						  valor = frutas * 3.70;
						  System.out.println("Você comprou " + frutas + " kg de frutas e vai pagar R$" + valor);
						  if (frutas > 8 || valor > 25)
						  {
								desconto = valor / 10;
								total = valor - desconto;
								System.out.print("Você comprou mais de 8kg de frutas ou acima de R$25,00 e por isso ganhou 10% de desconto");
								System.out.printf(" e por isso vai pagar R$%.2f", total);
						  }
					 }
					 break;
				default:
					 System.out.println("Quando você decidir comprar frutas, volte aqui estaremos aqui para atende-lo. =)");
					 System.exit(0);
		  }
	 }
}
