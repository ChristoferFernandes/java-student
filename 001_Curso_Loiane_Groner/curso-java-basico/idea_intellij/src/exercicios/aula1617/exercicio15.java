package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int seqInicial = 0;
            int seqFinal = 1;
            int fibonnaci = 0;

            System.out.print("Informe qual termo você quer ver o valor da sequência fibonnaci: ");
            int termo = tecla.nextInt();
            for (int count = 1; count <= termo; count++) {
                fibonnaci = seqInicial + seqFinal;
                System.out.println(fibonnaci);
                seqInicial = seqFinal;
                seqFinal = fibonnaci;
            }
            System.out.println("O valor da "+ termo +"º posição é: "+ fibonnaci);
    }
}
