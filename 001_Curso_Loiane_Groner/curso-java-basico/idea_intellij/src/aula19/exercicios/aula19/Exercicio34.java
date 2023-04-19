package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio34 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int[] valores = new int[10];
			
			for (int cont = 0; cont < valores.length; cont++) {
				 System.out.print("Informe o valor da " + (cont + 1) + "º posição: ");
				 valores[cont] = key.nextInt();
			}
			for (int cont = 0; cont < valores.length; cont++) {
				 System.out.println("Analisando o número: " + valores[cont]);
				 for (int count = 2; count < valores[cont]; count++) {
						if (count % 2 == 0) {
							 System.out.println("Valores que são pares = " + count);
						}
				 }
				 System.out.println();
			}
	 }
}
