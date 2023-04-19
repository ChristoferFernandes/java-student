package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e
o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um. */
public class Exer28 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double preco, soma, media;
	 int qtdCD;
	 
	 System.out.print("Informe a quantidade de CD comprados: ");
	 qtdCD = key.nextInt();
	 
	 soma = 0;
	 for (int i = 1; i <= qtdCD; i++) {
		System.out.print("Informe o valor do " + i + "º CD: R$");
		preco = key.nextDouble();
		
		soma += preco;
	 }
	 media = soma / qtdCD;
	 System.out.println("O valor médio gasto na compra dos CDs foi de : R$" + media);
  }
}
