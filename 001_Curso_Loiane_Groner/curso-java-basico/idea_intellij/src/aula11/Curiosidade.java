package src.aula11;

public class Curiosidade {
	 public static void main(String[] args) {
			int valorMaximo = 2147483647;
			int valor2 = 100;
			
			//O que vai acontecer se somar duas variáveis, sendo que a primeira está com o valor máximo permitido por inteiro.
			System.out.println(valorMaximo + valor2);
			
			//Funciona como uma roleta russa, ele volta para o valor mais alto negativo quando o valor mais alto positivo atinge
			//o limite, o mesmo serve para todos os tipos primitivos de números.
	 }
}
