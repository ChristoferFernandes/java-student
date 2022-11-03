package src.aula20;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Informe quantas pessoas serão entrevistadas: ");
            int numEntrevistados = key.nextInt();

            String[][] nomesFilhos = new String[numEntrevistados][];
            int qtdFilhos;
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.print("Informe a quantidade de filhos: ");
                qtdFilhos = key.nextInt();
                nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.print("Digite o nome do "+ (j+1) +"º filho: ");
                    nomesFilhos[i][j] = key.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println((i+1) +"Pessoa tem "+ (nomesFilhos[i].length) +" filhos.");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
            System.out.println();
        }
    }
}

