package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do primeiro valor: ");
            int num1 = tecla.nextInt();
        System.out.print("Entre com a informação do segundo valor: ");
            int num2 = tecla.nextInt();
        System.out.print("Entre com a informação do terceiro valor: ");
            int num3 = tecla.nextInt();
        //CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 1
        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println("Contagem regressiva...");
            System.out.println(num3 +","+ num2 +","+ num1);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
            System.out.println("Contagem regressiva...");
            System.out.println(num2 +","+ num3 +","+ num1);
         //CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 2
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
            System.out.println("Contagem Regressiva...");
            System.out.println(num3 +","+ num1 +","+ num2);
        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
            System.out.println("Contagem Regressiva...");
            System.out.println(num1 +","+ num3 +","+ num2);
            //CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO 3
        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
            System.out.println("Contagem Regressiva...");
            System.out.println(num2 +","+ num1 +","+ num3);
        } else if(num3 <= num1 && num3 <= num2 && num1 <= num2){
            System.out.println("Contagem Regressiva...");
            System.out.println(num2 +","+ num1 +","+ num3);
        }
    }
}