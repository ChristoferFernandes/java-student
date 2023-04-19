package src.aula17.exerciciosaula1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer38 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			DecimalFormat decimalF = new DecimalFormat("###.##");
			
			String pedido, encerrando, nomePedido;
			boolean saindo, encerrou;
			int codigo, qtd, qtdItem;
			double valorDaCompra, valorDoProduto, soma;
			
			saindo = false;
			encerrou = false;
			valorDaCompra = 0;
			soma = 0;
			qtdItem = 1;
			do {
				 System.out.println("Especificação  - Código - Preço");
				 System.out.println("Cachorro Quente  100      R$1,20");
				 System.out.println("Bauru Simples    101      R$1,30");
				 System.out.println("Bauru com Ovo    102      R$1,50");
				 System.out.println("Hamburguér       103      R$1,20");
				 System.out.println("Cheeseburguer    104      R$1,30");
				 System.out.println("Refrigerante     105      R$1,00");
				 
				 do {
						
						System.out.print("Olhe a tabela acima, e escolha seu produto através do código: ");
						codigo = key.nextInt();
						
						if (codigo == 100) {
							 valorDoProduto = 1.20;
							 nomePedido = "Cachorro Quente";
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else if (codigo == 101) {
							 valorDoProduto = 1.30;
							 nomePedido = "Bauru Simples";
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else if (codigo == 102) {
							 valorDoProduto = 1.50;
							 nomePedido = "Bauru com Ovo";
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else if (codigo == 103) {
							 nomePedido = "Hamburguér";
							 valorDoProduto = 1.30;
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else if (codigo == 104) {
							 valorDoProduto = 1.20;
							 nomePedido = "Cheeseburguer";
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else if (codigo == 105) {
							 valorDoProduto = 1;
							 nomePedido = "Refrigerante";
							 System.out.print("Quantos " + nomePedido + " você vai querer? ");
							 qtd = key.nextInt();
							 valorDaCompra = qtd * valorDoProduto;
							 System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + decimalF.format(valorDaCompra));
							 
						} else {
							 System.out.println("Pedido inválido, tente novamente.");
						}
						System.out.print("Deseja encerrar o pedido? [S/N]");
						encerrando = key.next();
						if (encerrando.equalsIgnoreCase("s")) {
							 encerrou = true;
						} else {
							 qtdItem++;
						}
						soma += valorDaCompra;
				 } while (!encerrou);
				 System.out.println("A quantidade de itens comprados foi de " + qtdItem);
				 System.out.println("O valor total da compra é: R$" + decimalF.format(soma));
				 
				 System.out.print("Deseja fazer um novo pedido? [S/N]");
				 pedido = key.next();
				 
				 if (pedido.equalsIgnoreCase("n")) {
						saindo = true;
						System.out.println("Obrigado por escolher a Lanchonete Imperial.");
						System.out.println("Volte sempre, você sempre será bem vindo!");
				 }
			} while (!saindo);
	 }
}
