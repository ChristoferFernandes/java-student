package src.aula20.execicios.aula20;

import java.util.Random;

public class Exercicio02 {
	 public static void main(String[] args) {
			Random mess = new Random();
			
			int[][] valoresMess = new int[10][10];
			
			for (int i = 0; i < valoresMess.length; i++) {
				 
				 for (int j = 0; j < valoresMess[i].length; j++) {
						valoresMess[i][j] = mess.nextInt(10);
						System.out.print(valoresMess[i][j] + " ");
				 }
				 System.out.println();
			}
			
			int maiorValorL5 = Integer.MIN_VALUE;
			int menorValorL5 = Integer.MAX_VALUE;
			int maiorValorC7 = Integer.MIN_VALUE;
			int menorValorC7 = Integer.MAX_VALUE;
			
			for (int i = 0; i < valoresMess[5].length; i++) {
				 if (valoresMess[5][i] > maiorValorL5) {
						maiorValorL5 = valoresMess[5][i];
				 }
				 if (valoresMess[5][i] < menorValorL5) {
						menorValorL5 = valoresMess[5][i];
				 }
				 for (int j = 0; j < valoresMess[i].length; j++) {
						if (valoresMess[i][7] > maiorValorC7) {
							 maiorValorC7 = valoresMess[i][7];
						}
						if (valoresMess[i][7] < menorValorC7) {
							 menorValorC7 = valoresMess[i][7];
						}
				 }
			}
			
			System.out.println("Maior valor na linha 5 = " + maiorValorL5);
			System.out.println("Menor valor na linha 5 = " + menorValorL5);
			System.out.println("Maior valor na coluna 7 = " + maiorValorC7);
			System.out.println("Menor valor na coluna 7= " + menorValorC7);
	 }
}
