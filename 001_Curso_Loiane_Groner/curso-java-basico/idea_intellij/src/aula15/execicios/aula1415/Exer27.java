package src.aula15.execicios.aula1415;

import java.util.Scanner;
/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango  R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total dacompra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de
maças adquiridas e escreva o valor a ser pago pelo cliente.
 */
public class Exer27 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int opcao;
	double morango, maca, preco = 0, desconto, total;

	System.out.println("Tabela de preços: ");
	System.out.println("Até 5kg, morango custa R$2,50 por kg, acima de 5kg, o morando custa R$2,20 por kg.");
	System.out.println("Até 5kg, maçã custa R$ 1,80 por kg, acima de 5kg, a maçã custa R$1,50 por kg.");
	System.out.println("Prezado cliente, se comprar mais de 8kg de qualquer uma das frutas, ou o valor total ultrapassar R$25,00 o cliente recebe um desconto de 10% em sua compra.");
	System.out.println("[1]- Para comprar Morangos ");
	System.out.println("[2]- Para comprar Maçãs ");
	opcao = key.nextInt();

	switch(opcao) {
	  case 1:
		System.out.print("Quantos KG de morango você quer comprar?: ");
		morango = key.nextDouble();

		if(morango <= 5) {
		  preco = morango * 2.50;
		  System.out.println("Você comprou "+ morango +"KG de morango.");
		  System.out.printf("Você vai pagar R$%.2f", preco);
		} else if (morango > 5 && morango < 8) {
		  preco = morango * 2.20;
		  System.out.println("Você comprou "+ morango +"KG de morango.");
		  System.out.printf("Você vai pagar R$%.2f", preco);
		}
		if (morango >= 8 || preco > 25) {
		  preco = morango * 2.20;
		  desconto = preco / 10;
		  total = preco - desconto;
		  System.out.print("Você comprou mais de 8kg de morango ou acima de R$25,00 e por isso ganhou 10% de desconto");
		  System.out.printf(" e por isso vai pagar R$%.2f", total);
		}
		break;
	  case 2:
		System.out.print("Quantos KG de maçã você quer comprar?: ");
		maca = key.nextDouble();

		if(maca <= 5) {
		  preco = maca * 1.80;
		  System.out.println("Você comprou "+ maca +"KG de maçã.");
		  System.out.printf("Você vai pagar R$%.2f", preco);
		} else if (maca > 5 && maca < 8) {
		  preco = maca * 1.50;
		  System.out.println("Você comprou "+ maca +"KG de maçã.");
		  System.out.printf("Você vai pagar R$%.2f", preco);
		}
		if (maca >= 8 || preco > 25) {
		  preco = maca * 1.50;
		  desconto = preco / 10;
		  total = preco - desconto;
		  System.out.print("Você comprou mais de 8kg de maçã ou acima de R$25,00 e por isso ganhou 10% de desconto");
		  System.out.printf(" e por isso vai pagar R$%.2f", total);
		}
		break;
	  default:
		System.out.println("Quando você decidir comprar frutas, volte aqui estaremos aqui para atende-lo.");
		System.exit(0);
	}
  }
}