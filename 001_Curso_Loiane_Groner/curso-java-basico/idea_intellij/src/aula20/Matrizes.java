package src.aula20;

public class Matrizes {
    public static void main(String [] args) {
        // FROMAS DE DECLARAR UM VETOR (LINHA) ou Matrizes
            double[] notaAlunos = new double[10]; // VETOR
            double[][] notasAlunos = new double[3][4]; // MATIRZ
            //FORMAS DE ATRIBUIR UM VALOR EM VETORES / MATRIZES;
            notaAlunos[0] = 1;
            notaAlunos[1] = 1;
            notaAlunos[2] = 1;
            notaAlunos[3] = 1;
            notaAlunos[4] = 1;
            notaAlunos[5] = 1;
            notaAlunos[6] = 1;
            notaAlunos[7] = 1;
            notaAlunos[8] = 1;
            notaAlunos[9] = 1;
            //ou podemos fazer da seguinte forma
            double[] notaAlunos2 = {1,2,3,4,5,6,7,8,9,10};
            notasAlunos[0][0] = 10;
            notasAlunos[0][1] = 7;
            notasAlunos[0][2] = 9;
            notasAlunos[0][3] = 9.5;

            notasAlunos[1][0] = 9;
            notasAlunos[1][1] = 8;
            notasAlunos[1][2] = 7;
            notasAlunos[1][3] = 9;

            notasAlunos[2][0] = 9;
            notasAlunos[2][1] = 5;
            notasAlunos[2][2] = 3;
            notasAlunos[2][3] = 7;
            double[][] notasAlunos2 = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
      for (int i = 0; i < notasAlunos.length; i++) {
          for (int j = 0; j < notasAlunos[i].length; j++) {
              System.out.print("|"+notasAlunos[i][j]);
          }
          System.out.println();
      }
    }
}
