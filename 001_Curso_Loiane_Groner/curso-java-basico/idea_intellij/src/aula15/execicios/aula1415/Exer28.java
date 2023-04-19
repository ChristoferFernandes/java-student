package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
o Até 5 Kg Acima de 5 Kg
o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente.
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra.
Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra:
tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar
 */
public class Exer28 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int carne;
	 double quantidade, preco, desconto, total;
	 char usarOuNao;
	 
	 System.out.println("HIPERMERCADO TABAJARA");
	 System.out.println("|---------------------");
	 System.out.println("1- Filé Duplo");
	 System.out.println("2- Alcatra");
	 System.out.println("3- Picanha");
	 System.out.println("|--------------------");
	 carne = key.nextInt();
	 
	 switch (carne) {
		case 1:
		  System.out.print("Informe quantos quilos de filé duplo você quer comprar: ");
		  quantidade = key.nextDouble();
		  
		  if (quantidade <= 5) {
			 preco = quantidade * 4.90;
			 
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  } else if (quantidade > 5) {
			 preco = quantidade * 5.80;
			 
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  }
		  break;
		case 2:
		  System.out.print("Informe quantos quilos de Alcatra você quer comprar: ");
		  quantidade = key.nextDouble();
		  
		  if (quantidade <= 5) {
			 preco = quantidade * 5.90;
			 
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  } else if (quantidade > 5) {
			 preco = quantidade * 6.80;
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  }
		  break;
		case 3:
		  System.out.print("Informe quantos quilos de Picanha você quer comprar: ");
		  quantidade = key.nextDouble();
		  
		  if (quantidade <= 5) {
			 preco = quantidade * 6.90;
			 
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  } else if (quantidade > 5) {
			 preco = quantidade * 7.80;
			 System.out.print("Deseja usar o cartão Tabajara?: ");
			 usarOuNao = key.next().charAt(0);
			 
			 if (usarOuNao == 's' || usarOuNao == 'S') {
				desconto = preco / 5;
				total = preco - desconto;
				System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
				System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
				System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
				System.out.printf("DESCONTO: R$%.2f\n", desconto);
				System.out.printf("TOTAL A PAGAR: R$%.2f\n", total);
				System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
				System.exit(0);
			 }
			 System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
			 System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
			 System.out.printf("TOTAL A PAGAR: R$%.2f\n", preco);
			 System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
		  }
		  break;
		default:
		  System.out.println("Opção inválida, Volte para o final da fila, espere sua vez, e escolha a carne se quiser.");
		  System.exit(0);
	 }
  }
}