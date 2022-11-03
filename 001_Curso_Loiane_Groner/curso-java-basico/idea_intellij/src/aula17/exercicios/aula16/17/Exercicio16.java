package src.aula17.execicios.aula1617;

public class Exercicio16 {
    public static void main(String[] args) {

        int seqInicial = 1;
        int seqFinal = 1;
        int fibonnaci = 0;

        System.out.print(seqInicial +",");
        System.out.print(seqFinal+ ",");

        while (fibonnaci < 500) {
            fibonnaci = seqInicial + seqFinal;
            System.out.print(fibonnaci +",");
            seqInicial = seqFinal;
            seqFinal = fibonnaci;
        }

    }
}

