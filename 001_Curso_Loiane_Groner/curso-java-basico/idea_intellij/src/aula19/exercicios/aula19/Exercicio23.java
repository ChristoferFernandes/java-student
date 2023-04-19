package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio23 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			
			for (int count = 0; count < vetorA.length; count++) {
				 System.out.print("Informe o " + (count + 1) + "º valor: ");
				 vetorA[count] = key.nextInt();
				 if (vetorA[count] % 2 == 1) {
						System.out.println(vetorA[count] + " é um número IMPAR.");
						System.out.println("O programa está sendo encerrado...");
						break;
				 }
			}
	 }
}
