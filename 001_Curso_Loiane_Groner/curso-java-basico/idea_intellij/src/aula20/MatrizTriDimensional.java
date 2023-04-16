package src.aula20;

public class MatrizTriDimensional {
  public static void main(String[] args) {

	int[][][] matrizTriDimensional = new int[3][3][3];
	int soma = 0;
	int somaPares = 0;
	int somaImpares = 0;


	for (int i = 0; i < matrizTriDimensional.length; i++) {
	  for (int j = 0; j < matrizTriDimensional[i].length; j++) {
		for (int k = 0; k < matrizTriDimensional[i][j].length; k++) {
		  matrizTriDimensional[i][j][k] = i + j + k;
		}
	  }
	}
	for (int i = 0; i < matrizTriDimensional.length; i++) {
	  for (int j = 0; j < matrizTriDimensional[i].length; j++) {
		for (int k = 0; k < matrizTriDimensional[i][j].length; k++) {
		  System.out.println("i - " + i + "| j - " + j + "| k - " + k);
		  soma += matrizTriDimensional[i][j][k];
		  if (matrizTriDimensional[i][j][k] % 2 == 0) {
			somaPares += matrizTriDimensional[i][j][k];
		  } else {
			somaImpares += matrizTriDimensional[i][j][k];
		  }
		}
	  }
	}
	System.out.println("Soma Total = " + soma);
	System.out.println("Soma dos pares = " + somaPares);
	System.out.println("soma dos impares = " + somaImpares);
  }
}
