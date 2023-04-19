package src.aula25.exercicios.ex04;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 JogoDaVelha jogando = new JogoDaVelha();
	 char jogou;
	 boolean ganhou = false;
	 int linha, coluna;
	 String tipoValor;
	 
	 System.out.println("Jogador 1 = 'X' ");
	 System.out.println("Jogador 2 = 'O' ");
	 
	 do {
		if (jogando.jogada % 2 == 1) { // JOGADOR 1
		  System.out.println("Vez do jogador 1");
		  jogou = 'X';
		} else {                    //JOGADOR 2
		  System.out.println("Vez do jogador 2.");
		  jogou = 'O';
		}
		linha = valor("Linha", key);
		coluna = valor("Coluna", key);
		
		if (!jogando.validarJogada(linha, coluna, jogou)) {
		  System.out.println("Posição já utilizada, tente novamente.");
		}
		
		jogando.criarTabuleiro();
		
		if (jogando.verificarVencedor('X')) {
		  ganhou = true;
		  System.out.println("Parabéns, Jogador 1 venceu a partida!");
		} else if (jogando.verificarVencedor('O')) {
		  ganhou = true;
		  System.out.println("Parabéns, Jogador 2 venceu a partida!");
		} else if (jogando.jogada > 9) {
		  System.out.println("EMPATE! A partida terminou.");
		  ganhou = true;
		}
	 } while (!ganhou);
  }
  
  static int valor(String tipoValor, Scanner key) {
	 boolean valorValido = false;
	 int valor;
	 do {
		System.out.print("Escolha a " + tipoValor + " (1-3): ");
		valor = key.nextInt();
		if (valor >= 1 && valor <= 3) {
		  valorValido = true;
		} else {
		  System.out.println("Linha inválida, tente novamente.");
		}
		valor--;
		return valor;
	 } while (!valorValido);
  }
}
