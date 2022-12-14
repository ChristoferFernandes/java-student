package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * O Hipermercado Tabajara está com uma promoção de carnes que é
 * imperdível. Confira:
 *                      Até 5 Kg        Acima de 5 Kg
 * o File Duplo		 R$ 4,90				 R$ 5,80 por Kg
 * o Alcatra			 R$5,90				 R$ 6,80 por Kg
 * o Picanha			 R$ 6,90				 R$ 7,80 por Kg
 * Para atender a todos os clientes, cada cliente poderá levar
 * apenas um dos tipos de carne da promoção, porém não há
 * limites para a quantidade de carne por cliente. Se compra for
 * feita no cartão Tabajara o cliente receberá ainda um desconto
 * de 5% sobre o total a compra. Escreva um programa que peça
 * o tipo e a quantidade de carne comprada pelo usuário e gere
 * um cupom fiscal, contendo as informações da compra: tipo e
 * quantidade de carne, preço total, tipo de pagamento, valor do
 * desconto e valor a pagar.
 */
public class Exercicio28
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  int carne;
		  double quantidade;
		  double valor;
		  char cartao;
		  double desconto;
		  double total;
		  char usarOuNao;
		  
		  System.out.println("HIPERMERCADO TABAJARA");
		  System.out.println("|---------------------");
		  System.out.println("1- Filé Duplo");
		  System.out.println("2- Alcatra");
		  System.out.println("3- Picanha");
		  System.out.println("|--------------------");
		  carne = tecla.nextInt();
		  
		  switch (carne) {
				case 1:
					 System.out.print("Informe quantos quilos de filé duplo você quer comprar: ");
					 quantidade = tecla.nextDouble();
					 
					 if (quantidade <= 5)
					 {
						  valor = quantidade * 4.90;
						  System.out.println("Você está comprando " + quantidade + " kg de filé duplo, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S') {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								
								if (usarOuNao == 's' || usarOuNao == 'S') {
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
						  }
					 }
					 else if (quantidade > 5)
					 {
						  valor = quantidade * 5.80;
						  System.out.println("Você está comprando " + quantidade + " kg de filé duplo, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S')
						  {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								if (usarOuNao == 's' || usarOuNao == 'S') {
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
						  }
					 }
					 break;
				
				case 2:
					 System.out.print("Informe quantos quilos de Alcatra você quer comprar: ");
					 quantidade = tecla.nextDouble();
					 
					 if (quantidade <= 5)
					 {
						  valor = quantidade * 5.90;
						  System.out.println("Você está comprando " + quantidade + " kg de Alcatra, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S')
						  {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								if (usarOuNao == 's' || usarOuNao == 'S') {
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
						  }
					 } else if (quantidade > 5)
					 {
						  valor = quantidade * 6.80;
						  System.out.println("Você está comprando " + quantidade + " kg de Alcatra, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S')
						  {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								
								if (usarOuNao == 's' || usarOuNao == 'S')
								{
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
						  }
					 }
					 break;
				
				case 3:
					 System.out.print("Informe quantos quilos de Picanha você quer comprar: ");
					 quantidade = tecla.nextDouble();
					 
					 if (quantidade <= 5)
					 {
						  valor = quantidade * 6.90;
						  System.out.println("Você está comprando " + quantidade + " kg de Picanha, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S')
						  {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								
								if (usarOuNao == 's' || usarOuNao == 'S') {
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
						  }
					 }
					 else if (quantidade > 5)
					 {
						  valor = quantidade * 7.80;
						  System.out.println("Você está comprando " + quantidade + " kg de Picanha, e vai pagar R$" + valor);
						  System.out.print("Você tem um cartão tabajara? [S/N]: ");
						  cartao = tecla.next().charAt(0);
						  
						  if (cartao == 's' || cartao == 'S')
						  {
								System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
								usarOuNao = tecla.next().charAt(0);
								
								if (usarOuNao == 's' || usarOuNao == 'S')
								{
									 desconto = valor / 5;
									 total = valor - desconto;
									 
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
									 System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
									 System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
									 System.out.printf("DESCONTO: R$%.2f\n", desconto);
									 System.out.printf("TOTAL: R$%.2f\n", total);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
								else
								{
									 System.out.println("IMPRIMINDO.....");
									 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
									 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
									 System.out.printf("TOTAL: R$%.2f\n", valor);
									 System.out.println("");
									 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								}
						  }
						  else
						  {
								System.out.println("IMPRIMINDO.....");
								System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
								System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
								System.out.printf("TOTAL: R$%.2f\n", valor);
								System.out.println("");
								System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
								
						  }
					 }
					 break;
				
				default:
					 System.out.println("Opção inválida, Volte para o final da fila, espere sua vez, e escolha a carne se quiser.");
					 System.exit(0);
		  }
	 }
}

