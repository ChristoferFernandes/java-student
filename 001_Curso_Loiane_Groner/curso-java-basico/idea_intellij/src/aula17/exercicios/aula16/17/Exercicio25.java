package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int idade, media;
        int soma = 0;
        String faixaEtaria;

        System.out.print("Entre com a informação da quantidade de pessoas no grupo: ");
        int quantidade = tecla.nextInt();

        for (int count = 1;count <= quantidade; count ++) {
            System.out.print("Informe a idade da "+ count +"º pessoa do grupo: ");
            idade = tecla.nextInt();

            soma += idade;
        }
        media = soma / quantidade;
        if (media >= 0 && media <= 25) {
            faixaEtaria = "Jovem";
        } else if (media >= 26 && media <= 60) {
            faixaEtaria = "Adulto";
        } else {
            faixaEtaria = "Idosa";
        }
        System.out.println("Idade média da turma: "+ media +" anos.");
        System.out.println("A turma é "+ faixaEtaria);
    }
}
