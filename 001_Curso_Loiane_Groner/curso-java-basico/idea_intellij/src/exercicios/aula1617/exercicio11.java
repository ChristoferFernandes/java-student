package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int menorNum = 0;
        int diferenca;
        int soma = 0;

        System.out.print("Informe um número inteiro: ");
            int num1 = tecla.nextInt();
        System.out.print("Informe outro número inteiro: ");
            int num2 = tecla.nextInt();

        if (num1 < num2) {
            menorNum = num1;
        } else {
            menorNum = num2;
        }
        System.out.println(menorNum);
            diferenca = Math.abs(num1 - num2);


        for(int count = 1; count < diferenca ;count++) {
            System.out.println(menorNum + count + "");
            soma = menorNum + diferenca + count;
        }
        System.out.println("");
        System.out.println(soma);
    }
}

