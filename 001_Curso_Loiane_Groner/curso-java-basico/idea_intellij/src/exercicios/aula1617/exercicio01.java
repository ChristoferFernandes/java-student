package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int count = 0;
        do{
            System.out.print("Entre com a informação de uma nota de 0 a 10: ");
                count = tecla.nextInt();

            if(count > 10){
                System.out.println("NOTA INVÁLIDA!");
                System.out.println("Informe uma nota válido!");
            }
        }while(count > 10);
        System.out.println(count +" é uma nota válida.");
    }
}
