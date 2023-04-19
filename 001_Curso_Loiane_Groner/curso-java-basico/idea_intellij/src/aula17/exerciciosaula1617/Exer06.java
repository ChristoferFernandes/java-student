package src.aula17.exerciciosaula1617;

/*
Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro
 */
public class Exer06 {
	 public static void main(String[] args) {
			int i;
			i = 1;
			//CÓDIGO PARA UM ABAIXO DO OUTRO
			while (i <= 20) {
				 System.out.println(i);
				 i++;
			}
			//CÓDIGO PARA UM DO LADO DO OUTRO
			i = 1;
			while (i <= 20) {
				 System.out.print(" " + i);
				 i++;
			}
	 }
}
