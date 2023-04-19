package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato
 */
public class Exer08 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			double preco, preco2, preco3;
			
			System.out.print("Informe o preço do primeiro produto R$: ");
			preco = key.nextDouble();
			
			System.out.print("Informe o preço do segundo produto R$: ");
			preco2 = key.nextDouble();
			
			System.out.print("Informe o preço do terceiro produto R$: ");
			preco3 = key.nextDouble();
			
			if (preco < preco2 && preco < preco3) {
				 System.out.println("O primeiro preço custa R$" + preco + " é o mais barato e  indicado a comprar.");
			} else if (preco2 < preco && preco2 < preco3) {
				 System.out.println("O segundo preço custa R$" + preco2 + " é o mais barato e  indicado a comprar.");
			} else {
				 System.out.println("O terceiro preço custa R$" + preco3 + " é o mais barato e  indicado a comprar.");
			}
	 }
}
