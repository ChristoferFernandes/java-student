package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] valores = new int[10];
            boolean primo = true;
            String mensagem = "";

        for (int cont = 0; cont < valores.length; cont++) {
            System.out.print("Entre com o valor da "+ (cont+1) +"º posição: ");
                valores[cont] = key.nextInt();
        }
        for (int cont = 0; cont < valores.length; cont++) {
           for (int count = 2; count < valores[cont]; count++) {
               if (valores[cont] % count == 0) {
                   primo = false;
                   mensagem = " Não é um número primo!";
                   break;
               } else {
                   mensagem = " É um número primo!";
               }
           }
            System.out.println(valores[cont] +""+mensagem);
        }
    }
}
