package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/* Altere o programa anterior para que ele aceite apenas números entre 0 e 1000 */
public class Exer19 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int maiorValor, menorValor, soma, diferenca, valor, num;
	 
	 System.out.print("Entre com a informação de quantos números terá no conjunto numérico: ");
	 valor = key.nextInt();
	 
	 diferenca = 0;
	 soma = 0;
	 maiorValor = 0;
	 menorValor = 0;
	 for (int count = 1; count <= valor; count++) {
		System.out.print("Entre com a informação do " + count + "º valor: ");
		num = key.nextInt();
		
		if (num >= 0 && num < 1000) {
		
		} else {
		  System.out.println("Não pode informar valores menor que 0 ou maior que 1.000");
		  System.out.println("Encerrando o programa...");
		  System.exit(0);
		}
		
		if (num > diferenca) {
		  maiorValor = num;
		} else if (num < diferenca) {
		  menorValor = num;
		}
		diferenca = num;
		soma += diferenca;
	 }
	 System.out.println("O maior valor digitado foi: " + maiorValor);
	 System.out.println("O menor valor digitado foi: " + menorValor);
	 System.out.println("A soma entre os valores é de: " + soma);
  }
}
