package src.aula14;

import java.util.Scanner;

public class IfElse {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int idade;
			double valor;

      /*System.out.print("Informe a sua idade: ");
      idade = key.nextInt();

      if(idade >= 18)
      {
      System.out.println("Você é maior de idade.");
      }
      else
      {
      System.out.println("Você não é maior de idade.");
      }*/
			
			// valor <= 10 então está super barato, tem que comprar
			// valor < 10 valor < 15 então pedir desconto
			// valor <= 15  <= 17 então pesquisar mais
			// valor >= 17 então muito caro
			System.out.print("Informe o preço do item: ");
			valor = key.nextDouble();
			
			if (valor <= 10) {
				 System.out.println("Está super barato, pode comprar!");
			} else if (valor > 10 && valor <= 15) {
				 System.out.println("Você pode pedir um desconto!");
			} else if (valor >= 15 && valor < 17) {
				 System.out.println("Você pode pesquisar mais!");
			} else {
				 System.out.println("O preço está muito acima, você não pode comprar!");
			}
	 }
}

