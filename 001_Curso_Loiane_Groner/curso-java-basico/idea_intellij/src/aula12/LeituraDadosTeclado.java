package src.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			String nomeCompleto;
			String primeiroNome;
			int idade;
			int idade2;
			double altura;
			float altura2;
			byte qtdFilhos;
			boolean temPet;
			
			System.out.print("Informe seu nome completo: ");
			nomeCompleto = key.nextLine();
			System.out.println("Seu nome completo é: " + nomeCompleto);
			
			System.out.print("Informe o seu primeiro nome: ");
			primeiroNome = key.next();
			System.out.println("Seu primeiro nome é: " + primeiroNome);
			
			System.out.print("Informe a sua idade: ");
			idade = key.nextInt();
			System.out.println("Sua idade é de " + idade + " anos.");
			
			System.out.print("Informe a sua altura: ");
			altura = key.nextDouble();
			System.out.println("A sua altura é de " + altura);
			
			System.out.println("Informe o seu primeiro nome, idade, quantidade de filhos, altura, e se tem bichinho de estimação: ");
			primeiroNome = key.next();
			idade2 = key.nextInt();
			qtdFilhos = key.nextByte();
			altura2 = key.nextFloat();
			temPet = key.nextBoolean();
			
			System.out.println("Você informou os seguintes dados: ");
			System.out.println("Seu primeiro nome: " + primeiroNome);
			System.out.println("Sua idade: " + idade2);
			System.out.println("Quantidade de filhos: " + qtdFilhos);
			System.out.println("Sua altura " + altura2);
			System.out.println("Tem animal de estimação: " + temPet);
	 }
}
