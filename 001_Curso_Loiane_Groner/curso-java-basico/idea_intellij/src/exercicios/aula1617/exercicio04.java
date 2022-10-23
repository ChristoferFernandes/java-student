package src.exercicios.aula1617;

public class Exercicio04 {
    public static void main(String[] args) {

            int count = 0;
            int paisA = 80000;
            int paisB = 200000;

        while (paisA < paisB){
            paisA += (paisA / 100) * 3;
            paisB +=(paisB / 100) * 1.5;
            count ++;
        }
        System.out.println("População A: "+ paisA);
        System.out.println("População B: "+ paisB);
        System.out.println("Quantidade de anos para ultrapassagem: "+ count +" anos.");
    }
}
