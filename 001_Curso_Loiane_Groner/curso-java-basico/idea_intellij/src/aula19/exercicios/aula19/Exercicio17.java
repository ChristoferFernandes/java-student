package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
	 Scanner tecla = new Scanner(System.in);
	 
	 int[] linhaA = new int[10];
	 int idade = 0;
	 for (int count = 0; count < linhaA.length; count++) {
		System.out.print("Informe a idade do " + (count + 1) + "º usuário: ");
		linhaA[count] = tecla.nextInt();
	 }
	 System.out.print("Idades informadas: ");
	 for (int count = 0; count < linhaA.length; count++) {
		System.out.print(linhaA[count] + " ");
		if (linhaA[count] > 35) {
		  idade++;
		}
	 }
	 System.out.println();
	 System.out.println("Pessoas com idade maior que 35 anos: " + idade);
  }
}
