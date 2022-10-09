package src.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        //Exemplo 01
        /*System.out.println("Informe a sua idade: ");
            int idade = tecla.nextInt();
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você ainda é menor de idade.");
        }
        */
            //Exemplo 02
        //Considere <= 10 barato. > 10 e < 15 pedir desconto. >= 17 muito caro, não comprar.
        System.out.print("Entre com a informação de um valor: R$");
            double valor = tecla.nextDouble();
        if(valor <= 10){
            System.out.println("Pode comprar, está barato.");
        }else if(valor > 10 && valor < 15){
            System.out.println("Pode comprar, mas pede um desconto.");
        }else if(valor >= 15 && valor < 17){
            System.out.println("Pode pesquisar mais o preço do produto.");
        }else{
            System.out.println("Não compre. Está muito caro.");
        }
    }
}

