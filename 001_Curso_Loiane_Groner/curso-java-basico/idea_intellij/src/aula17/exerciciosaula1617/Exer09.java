package src.aula17.exerciciosaula1617;

//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
public class Exer09 {
	 public static void main(String[] args) {
			
			int i;
			
			i = 1;
			while (i < 50) {
				 if (i % 2 == 1) {
						System.out.println(i);
				 }
				 i++;
			}
	 }
}
