package src.aula13.execicios.aula131211;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do tamanho do arquivo: ");
            double tamanhoDoArquivo = tecla.nextDouble();
        System.out.print("Entre com a informação da velocidade da sua internet: ");
            double velocidadeDaInternet = tecla.nextDouble();

            double tempoDeDownload = tamanhoDoArquivo / velocidadeDaInternet;
        System.out.println("Tempo de download: "+ tempoDeDownload);
    }
}

