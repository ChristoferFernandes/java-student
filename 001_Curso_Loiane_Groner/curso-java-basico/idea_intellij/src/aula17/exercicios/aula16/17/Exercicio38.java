package src.aula17.execicios.aula1617;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio38 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);
	DecimalFormat format = new DecimalFormat("###.##");

	String pedido, encerrando, nomePedido;
	boolean saindo = false;
	boolean encerrou = false;
	int codigo, qtd, qtdItem = 1;
	double valorDaCompra = 0, valorDoProduto, soma = 0;

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
		codigo = tecla.nextInt();

		if (codigo == 100) {
		  valorDoProduto = 1.20;
		  nomePedido = "Cachorro Quente";
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else if (codigo == 101) {
		  valorDoProduto = 1.30;
		  nomePedido = "Bauru Simples";
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else if (codigo == 102) {
		  valorDoProduto = 1.50;
		  nomePedido = "Bauru com Ovo";
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else if (codigo == 103) {
		  nomePedido = "Hamburguér";
		  valorDoProduto = 1.30;
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else if (codigo == 104) {
		  valorDoProduto = 1.20;
		  nomePedido = "Cheeseburguer";
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else if (codigo == 105) {
		  valorDoProduto = 1;
		  nomePedido = "Refrigerante";
		  System.out.print("Quantos " + nomePedido + " você vai querer? ");
		  qtd = tecla.nextInt();
		  valorDaCompra = qtd * valorDoProduto;
		  System.out.println("Você está comprando " + qtd + " unidades de " + nomePedido + " e vai pagar R$" + format.format(valorDaCompra));

		} else {
		  System.out.println("Pedido inválido, tente novamente.");
		}
		System.out.print("Deseja encerrar o pedido? [S/N]");
		encerrando = tecla.next();
		if (encerrando.equalsIgnoreCase("s")) {
		  encerrou = true;
		} else {
		  qtdItem++;
		}
		soma += valorDaCompra;
	  } while (!encerrou);
	  System.out.println("A quantidade de itens comprados foi de " + qtdItem);
	  System.out.println("O valor total da compra é: R$" + format.format(soma));

	  System.out.print("Deseja fazer um novo pedido? [S/N]");
	  pedido = tecla.next();

	  if (pedido.equalsIgnoreCase("n")) {
		saindo = true;
		System.out.println("Obrigado por escolher a Lanchonete Imperial.");
		System.out.println("Volte sempre, você sempre será bem vindo!");
	  }
	} while (!saindo);
  }
}