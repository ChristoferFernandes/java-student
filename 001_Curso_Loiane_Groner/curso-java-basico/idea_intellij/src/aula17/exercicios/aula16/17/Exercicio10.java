package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int num1;
            int num2;
            int menorNum = 0;
            int diferenca;

        System.out.print("Informe um número inteiro: ");
            num1 = tecla.nextInt();
        System.out.print("Informe outro número inteiro: ");
            num2 = tecla.nextInt();

        if (num1 < num2) {
            menorNum = num1;
        } else {
            menorNum = num2;
        }
        diferenca = Math.abs(num1 - num2);

        for(int count = 1; count < diferenca ;count++){
            System.out.println(menorNum + count + "");
        }
    }
}
