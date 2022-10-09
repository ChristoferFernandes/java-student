package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("TABELA DE PREÇOS: ");
        System.out.println("PREÇO DA GASOLINA: R$2,50 >> PROMOÇÃO DO DIA 4% DE DESCONTO EM ATÉ 20 LITROS, E 6% DE DESCONTO ACIMA DE 20 LITROS.");
        System.out.println("PREÇO DO ÁLCOOL: R$1,90 >> PROMOÇÃO DO DIA 3% DE DESCONTO EM ATÉ 20 LITROS, E 5% DE DESCONTO ACIMA DE 20 LITROS.");
        System.out.println("");
        System.out.print("Você quer Álcool ou Gasolina? [A PARA ALCOOL/ G PARA GASOLINA]: ");
        char combustivel = tecla.next().charAt(0);
        if(combustivel == 'A' || combustivel == 'a'){
            System.out.print("Quanto você deseja colocar de Alcool? ");
            double alcool = tecla.nextDouble();

            double valor = alcool * 1.90;
            double desconto, total;

            if(alcool <= 20){
                desconto = valor / 3;
                total = valor - desconto;
                System.out.println("");
                System.out.printf("Em "+ alcool+ " Litros, você vai pagar: R$%.2f",total);

            }else if(alcool > 20){
                desconto = valor / 5;
                total = valor - desconto;
                System.out.println("");
                System.out.printf("Em "+ alcool+ " Litros, você vai pagar: R$%.2f", total);
            }
        }
        if(combustivel == 'G' || combustivel == 'g'){
            System.out.print("Quanto você deseja colocar de gasolina? ");
            double gasolina = tecla.nextDouble();

            double desconto, total, valor;
            valor = gasolina * 2.50;
            if(gasolina <= 20){
                desconto = valor / 4;
                total = valor - desconto;
                System.out.println("");
                System.out.printf("Em "+ gasolina+" Litros, você vai pagar: R$%2.f",total);
            }else if(gasolina > 20){
                desconto = valor / 6;
                total = valor - desconto;
                System.out.println("");
                System.out.printf("Em "+ gasolina+" Litros, você vai pagar: R$%.2f",total);
            }
        }
    }
}
