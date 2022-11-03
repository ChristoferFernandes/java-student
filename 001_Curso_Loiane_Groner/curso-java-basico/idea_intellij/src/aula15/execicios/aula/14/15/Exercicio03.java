package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação, F/M: ");
            String sexo = tecla.next();
        if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - FEMININO.");
        } else if(sexo.equalsIgnoreCase("m")){
            System.out.println("M - MASCULINO.");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}
