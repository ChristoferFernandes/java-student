package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação de um valor: ");
            double valor = tecla.nextDouble();

        if(valor >= 0){
            System.out.println(valor +" É POSITIVO.");
        }else{
            System.out.println(valor +" É NEGATIVO.");
        }
    }
}
