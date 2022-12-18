package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = tecla.nextDouble();

        if((int) numero == numero){
            System.out.println(numero+" É INTEIRO");
        }else{
            System.out.println(numero+ " É DECIMAL");
        }
    }
}

