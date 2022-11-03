package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do primeiro número: ");
            double valor = tecla.nextDouble();
        System.out.print("Entre com a informação do segundo número: ");
            double valor2 = tecla.nextDouble();

        if(valor > valor2){
            System.out.println("O primeiro valor é maior. Valor digitado: "+ valor);
        }else{
            System.out.println("O segundo valor é maior. Valor digitado: "+ valor2);
        }
    }
}
