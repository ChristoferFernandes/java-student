package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro produto: ");
            double valor = tecla.nextDouble();
        System.out.print("Informe o valor do segundo produto: ");
            double valor2 = tecla.nextDouble();
        System.out.print("Informe o valor do terceiro produto: ");
            double valor3 = tecla.nextDouble();

        if(valor < valor2 && valor < valor3){
            System.out.println("Você deve comprar o 1º produto, é o mais barato.");

        }else if(valor2 < valor && valor2 < valor3){
            System.out.println("Você deve comprar o 2º produto, é o mais barato.");

        }else{
            System.out.println("Você deve comprar o 3º produto, é o mais barato.");
        }
    }
}
