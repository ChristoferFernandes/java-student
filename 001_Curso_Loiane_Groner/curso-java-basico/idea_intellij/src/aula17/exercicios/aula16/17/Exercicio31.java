package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio31 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	boolean saindo = false;
	int count = 1;
	String sair;
	double preco, valor, troco;
	double soma = 0;
	do {
	  System.out.println("Lojas Tabajara");
	  while (count != 0) {
		System.out.print(count + " - R$");
		preco = tecla.nextDouble();
		soma = soma + preco;
		if (preco == 0) {
		  count = 0;
		  break;
		}
		count++;
	  }
	  System.out.println("Total: R$" + soma);
	  System.out.print("Dinheiro: R$");
	  valor = tecla.nextDouble();
	  troco = valor - soma;
	  System.out.println("Troco: R$" + troco);
	  System.out.print("Deseja continuar com a compra? [S/N]: ");
	  sair = tecla.next();
	  if (sair.equalsIgnoreCase("s")) {
		preco = 0;
		valor = 0;
		troco = 0;
		count = 1;
	  } else if (sair.equalsIgnoreCase("n")) {
		saindo = true;
		System.out.println("Obrigado por comprar nas lojas tabajaras...");
	  }
	} while (!saindo);
  }
}
