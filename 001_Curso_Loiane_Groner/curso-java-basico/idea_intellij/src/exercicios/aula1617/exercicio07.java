package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int count = 1;
            double valor, resultado = 0;

        while (count <= 5){
            System.out.print("Informe um número: ");
                valor = tecla.nextDouble();
            if (valor > resultado){
                resultado = valor;
            }
                count ++;
        }
        System.out.println("O maior valor digitado foi: " + resultado);
    }
}
