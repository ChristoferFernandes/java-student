package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 *Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
 informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */
public class Exercicio14
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação do tamanho do arquivo: ");
		  double tamanhoDoArquivo = tecla.nextDouble();
		  
		  System.out.print("Entre com a informação da velocidade da sua internet: ");
		  double velocidadeDaInternet = tecla.nextDouble();
		  
		  double tempoDeDownload = tamanhoDoArquivo / velocidadeDaInternet;
		  System.out.println("Tempo de download: "+ tempoDeDownload);
	 }
}

