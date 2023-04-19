package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra.
O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular
e mostrar o valor do troco. Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra.
A saída deve ser conforme o exemplo abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...*/
public class Exer31 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			boolean saindo = false;
			int count;
			String sair;
			double preco, valor, troco, soma;
			
			soma = 0;
			count = 1;
			do {
				 System.out.println("Lojas Tabajara");
				 System.out.println("Pressione 0 para sair.");
				 while (count != 0) {
						System.out.print(count + " - R$");
						preco = key.nextDouble();
						
						soma += preco;
						if (preco == 0) {
							 count = 0;
							 break;
						}
						count++;
				 }
				 System.out.println("Total: R$" + soma);
				 System.out.print("Dinheiro: R$");
				 valor = key.nextDouble();
				 troco = valor - soma;
				 System.out.println("Troco: R$" + troco);
				 System.out.print("Deseja continuar com a compra? [S/N]: ");
				 sair = key.next();
				 if (sair.equalsIgnoreCase("s")) {
						preco = 0;
						valor = 0;
						troco = 0;
						count = 1;
						soma = 0;
				 } else if (sair.equalsIgnoreCase("n")) {
						saindo = true;
						System.out.println("Obrigado por comprar nas lojas tabajaras...");
				 }
			} while (!saindo);
	 }
}
