package src.aula20.execicios.aula20;

import java.util.Random;

public class Exercicio01 {
	 public static void main(String[] args) {
			Random random = new Random();
			int[][] valores = new int[4][4];
			
			for (int i = 0; i < valores.length; i++) {
				 for (int j = 0; j < valores[i].length; j++) {
						valores[i][j] = random.nextInt(10);
						System.out.print(valores[i][j] + " ");
				 }
				 System.out.println();
			}
			int maiorValor = Integer.MIN_VALUE;
			int linha = Integer.MIN_VALUE;
			int coluna = Integer.MIN_VALUE;
			for (int i = 0; i < valores.length; i++) {
				 for (int j = 0; j < valores[i].length; j++) {
						if (valores[i][j] > maiorValor) {
							 maiorValor = valores[i][j];
							 linha = i;
							 coluna = j;
						}
				 }
			}
			System.out.println("Maior valor = " + maiorValor);
			System.out.println("Na linha " + linha);
			System.out.println("E coluna " + coluna);
	 }
}
