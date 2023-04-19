package src.aula17.exerciciosaula1617;

/* A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
Faça um programa que gere a série até que o valor seja maior que 500 */
public class Exer16 {
	 public static void main(String[] args) {
			
			int seqInicial, seqFinal, fibonnaci;
			
			seqInicial = 1;
			seqFinal = 1;
			
			System.out.print(seqInicial + ", ");
			System.out.print(seqFinal + "");
			
			fibonnaci = 0;
			while (fibonnaci < 500) {
				 fibonnaci = seqInicial + seqFinal;
				 System.out.print(", " + fibonnaci);
				 seqInicial = seqFinal;
				 seqFinal = fibonnaci;
			}
	 }
}
