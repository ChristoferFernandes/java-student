package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada */
public class Exer25 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int idade, media, soma, quantidade;
			String faixaEtaria;
			
			System.out.print("Informe quantas pessoas tem no grupo: ");
			quantidade = key.nextInt();
			
			soma = 0;
			for (int i = 1; i <= quantidade; i++) {
				 System.out.print("Informe a idade da " + i + "º pessoa do grupo: ");
				 idade = key.nextInt();
				 
				 soma += idade;
			}
			media = soma / quantidade;
			if (media >= 0 && media <= 25) {
				 faixaEtaria = "Jovem";
			} else if (media >= 26 && media <= 60) {
				 faixaEtaria = "Adulto";
			} else {
				 faixaEtaria = "Idosa";
			}
			System.out.println("Idade média da turma: " + media + " anos.");
			System.out.println("A turma é formada por mais " + faixaEtaria);
	 }
}
