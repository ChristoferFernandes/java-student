package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = tecla.nextInt();

        if(numero % 2 == 1){
            System.out.println(numero+" é um valor IMPAR.");
        }else{
            System.out.println(numero+" é um valor PAR.");
        }
    }
}

