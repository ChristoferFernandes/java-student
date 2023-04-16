package src.aula19;

public class Arrays {
  public static void main(String[] args) {

	//variável simples
	double tempDiaria001 = 31.3;
	double tempDiaria002 = 32;
	double tempDiaria003 = 33.7;
	double tempDiaria004 = 34;
	double tempDiaria005 = 33.1;
	//VETOR

	double[] temperaturas = new double[365];
	temperaturas[0] = 31.3;
	temperaturas[1] = 32;
	temperaturas[2] = 33.7;
	temperaturas[3] = 34;
	temperaturas[4] = 33.1;

	System.out.println("O valor da temperatura do 03 dia é: " + temperaturas[2]);
	System.out.println("O tamanho do array" + temperaturas.length);
	System.out.println("O valores do array: " + temperaturas);
  }
}
