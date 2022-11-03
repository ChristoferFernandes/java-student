package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int count;
            boolean saindo = false;
        do{
            System.out.print("Entre com a informação de uma nota de: ");
                count = tecla.nextInt();

            if(count < 0 || count > 10){
                System.out.println("NOTA INVÁLIDA!");
                System.out.println("Informe uma nota entre 0 e 10");
            } else {
                System.out.println(count +" É UMA NOTA VÁLIDA.");
                saindo = true;
            }
        }while(!saindo);

    }
}
