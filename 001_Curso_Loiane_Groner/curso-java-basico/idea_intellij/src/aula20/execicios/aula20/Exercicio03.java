package src.aula20.execicios.aula20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String [] args) {
        Scanner key = new Scanner(System.in);

            int[][] valores = new int[3][3];

        for(int i = 0; i < valores.length; i++) {

            for(int j = 0; j < valores[i].length; j++) {
                System.out.print("Informe o valor da "+ (i+1) +"º linha e "+ (j+1) +"º coluna: ");
                    valores[i][j] = key.nextInt();
            }
        }
        System.out.println("MATRIZ DE 3X3");
        System.out.println("---------------");
            int totalPAR = 0;
            int totalIMPAR = 0;
       for(int i = 0; i < valores.length; i++) {

            for(int j = 0; j < valores[i].length; j++) {
                System.out.print(valores[i][j] +"   ");

                if (valores[i][j] % 2 == 0) {
                    totalPAR ++;
                } else {
                    totalIMPAR ++;
                }
            }
           System.out.println();
        }
        System.out.println("Total de números PARES = "+ totalPAR);
        System.out.println("Total de números IMPARES = "+ totalIMPAR);
    }
}
