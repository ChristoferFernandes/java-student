package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do primeiro valor: ");
            double valor = tecla.nextDouble();
        System.out.print("Entre com a informação do primeiro valor: ");
            double valor2 = tecla.nextDouble();
        System.out.print("Entre com a informação do primeiro valor: ");
            double valor3 = tecla.nextDouble();

        if(valor > valor2 && valor > valor3){
            System.out.println(valor +" é o primeiro e o maior valor digitado.");
        } else if(valor2 > valor && valor2 > valor3){
            System.out.println(valor2 +" é o segundo e o  maior valor digitado.");
        } else {
            System.out.println(valor3 +" é o terceiro e o  maior valor digitado.");
        }
    }
}
