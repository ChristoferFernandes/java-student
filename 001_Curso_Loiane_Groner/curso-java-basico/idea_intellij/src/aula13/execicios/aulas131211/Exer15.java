package src.aula13.execicios.aulas131211;
/*
Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos)
 */
import java.util.Scanner;

public class Exer15 {
	 public static void main(String[] args) {
		  Scanner key = new Scanner(System.in);

		  double tamanhoArquivo, velocidadeInternet, tempoAproximado;

		  System.out.print("Informe o tamanho do arquivo: ");
		  tamanhoArquivo = key.nextDouble();

		  System.out.print("Informe a velocidade da sua internet: ");
		  velocidadeInternet = key.nextDouble();

		  tempoAproximado = tamanhoArquivo / velocidadeInternet;
		  System.out.println("O tempo aproximado para conclusão do download é de: "+ tempoAproximado);
	 }
}
