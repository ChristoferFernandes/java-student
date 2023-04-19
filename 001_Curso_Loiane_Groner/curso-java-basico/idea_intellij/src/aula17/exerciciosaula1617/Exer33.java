package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.*/
public class Exer33 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 double tempMaior, tempMenor, temperatura, soma, media;
	 
	 tempMaior = Double.MIN_VALUE;
	 tempMenor = Double.MAX_VALUE;
	 soma = 0;
	 
	 System.out.print("Informe a quantidade de temperaturas a serem verificadas: ");
	 int qtdTemperatura = key.nextInt();
	 
	 for (int i = 1; i <= qtdTemperatura; i++) {
		System.out.print("Entre com a Informação da " + i + "º temperatura: ");
		temperatura = key.nextDouble();
		
		if (temperatura > tempMaior) {
		  tempMaior = temperatura;
		}
		if (temperatura < tempMenor) {
		  tempMenor = temperatura;
		}
		soma = soma + temperatura;
		
	 }
	 media = soma / qtdTemperatura;
	 System.out.println("A maior temperatura informada foi de " + tempMaior + "º");
	 System.out.println("A menor temperatura informada foi de " + tempMenor + "º");
	 System.out.println("A média das temperaturas digitadas foi de " + media + "º");
  }
}
