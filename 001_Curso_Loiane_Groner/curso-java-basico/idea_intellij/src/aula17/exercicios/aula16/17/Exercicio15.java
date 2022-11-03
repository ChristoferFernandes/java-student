package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int seqInicial = 1;
            int seqFinal = 1;
            int fibonnaci = 0;

            System.out.print("Informe qual termo você quer ver o valor da sequência fibonnaci: ");
                int termo = tecla.nextInt();

            System.out.print(seqInicial +",");
            System.out.print(seqFinal);
            for (int count = 3; count <= termo; count++) {
                fibonnaci = seqInicial + seqFinal;
                System.out.print(", "+ fibonnaci);
                seqInicial = seqFinal;
                seqFinal = fibonnaci;
            }
            System.out.println();
            System.out.println("O valor da "+ termo +"º posição é: "+ fibonnaci);
    }
}
