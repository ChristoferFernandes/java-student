package src.aula17.exerciciosaula1617;

/*
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
public class Exer04 {
	 public static void main(String[] args) {
			int i = 0;
			int paisA = 80000;
			int paisB = 200000;
			
			while (paisA < paisB) {
				 paisA += (paisA / 100) * 3;
				 paisB += (paisB / 100) * 1.5;
				 i++;
			}
			System.out.println("População A: " + paisA);
			System.out.println("População B: " + paisB);
			System.out.println("Quantidade de anos para ultrapassagem: " + i + " anos.");
	 }
}
