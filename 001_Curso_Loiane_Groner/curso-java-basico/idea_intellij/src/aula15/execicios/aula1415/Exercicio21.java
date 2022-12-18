package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("NOTAS DISPONIVEIS: R$1,00 R$5,00 R$10,00 R$50,00 R$100,00");
        System.out.println("Você só pode sacar a partir de R$10,00 e o máximo de R$600,00");

        System.out.print("Quanto você quer sacar? R$ ");
        int saque = tecla.nextInt();

        if(saque < 10 || saque > 600){
            System.out.println("Saque inválido: Só pode sacar a partir de R$10,00 até R$600,00");
            System.exit(0);
        }
        int c100 = saque / 100;
        saque = saque % 100;
        int c50 = saque / 50;
        saque = saque % 50;
        int c10 = saque / 10;
        saque = saque % 10;
        int c5 = saque / 5;
        saque = saque % 5;
        int c1 = saque / 1;
        saque = saque % 1;

        System.out.println("IMPRIMINDO... ");
        System.out.println("R$100 = "+c100+", R$50 = "+c50+", R$10 = "+c10+", R$5 = "+c5+", R$1 = "+c1);
    }
}
