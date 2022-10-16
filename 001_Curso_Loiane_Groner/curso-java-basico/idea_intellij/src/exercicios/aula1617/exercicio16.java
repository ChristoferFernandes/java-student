package src.exercicios.aula1617;

public class exercicio16 {
    public static void main(String[] args) {

        int seqInicial = 0;
        int seqFinal = 1;
        int fibonnaci = 0;

        for (int count = 1; count <= 15; count++) {
            fibonnaci = seqInicial + seqFinal;
            System.out.print(fibonnaci +", ");
            seqInicial = seqFinal;
            seqFinal = fibonnaci;
        }

    }
}

