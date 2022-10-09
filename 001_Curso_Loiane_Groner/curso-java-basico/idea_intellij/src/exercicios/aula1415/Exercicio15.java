package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação do 1º lado do triângulo: ");
            int lado1 = tecla.nextInt();
        System.out.print("Entre com a informação do 2º lado do triângulo: ");
            int lado2 = tecla.nextInt();
        System.out.print("Entre com a informação do 3º lado do triângulo: ");
            int lado3 = tecla.nextInt();

        if(lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1){
            System.out.println("Pode formar um TRIÂNGULO.");
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Pode formar um triângulo EQUILATERO");
            }else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                System.out.println("Pode formar um triângulo ESCALENO");
            }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Pode formar um triângulo ISÓCELES");
            }
        } else{
            System.out.println("NÃO PODE FORMAR UM TRIÂNGULO");
        }
    }
}
