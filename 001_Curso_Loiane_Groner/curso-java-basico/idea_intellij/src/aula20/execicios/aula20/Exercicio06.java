package src.aula20.execicios.aula20;

import java.util.Scanner;

//JOGO DA VELHA
public class Exercicio06 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	char[][] jogoDaVelha = new char[3][3];
	boolean ganhou = false;
	int jogada = 1;
	char jogou;
	int linha;
	int coluna;

	System.out.println("Jogador 1 = 'O'");
	System.out.println("Jogador 2 = 'X'");
	do {
	  if (jogada % 2 == 1) { // JOGADOR 1
		System.out.println("Vez do jogador 1");
		jogou = 'O';
	  } else {                    //JOGADOR 2
		System.out.println("Vez do jogador 2.");
		jogou = 'X';
	  }

	  boolean linhaValida = false;
	  do {
		System.out.print(" Informe em qual linha você quer jogar (Linha 1, 2 ou 3): ");
		linha = key.nextInt();
		if (linha >= 1 && linha <= 3) {
		  linhaValida = true;
		} else {
		  System.out.println("Informe uma linha válida!");
		}
	  } while (!linhaValida);

	  boolean colunaValida = false;
	  do {
		System.out.print(" Informe em qual coluna você quer jogar (Coluna 1, 2 ou 3): ");
		coluna = key.nextInt();

		if (coluna >= 1 && coluna <= 3) {
		  colunaValida = true;
		} else {
		  System.out.println("Informe uma coluna válida!");
		}
	  } while (!colunaValida);
	  linha--;
	  coluna--;
	  //NÃO PERMITINDO JOGAR NA MESMA LINHA
	  if (jogoDaVelha[linha][coluna] == 'O' || jogoDaVelha[linha][coluna] == 'X') {
		System.out.println("Linha já preenchida, tente novamente.");
	  } else {
		jogoDaVelha[linha][coluna] = jogou;
		jogada++;
	  }
	  //TABULEIRO DO JOGO
	  for (int i = 0; i < jogoDaVelha.length; i++) {
		for (int j = 0; j < jogoDaVelha[i].length; j++) {
		  System.out.print(jogoDaVelha[i][j] + " | ");
		}
		System.out.println();
	  }

	  //VERIFICANDO O VENCEDOR DA PARTIDA
	  if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // GANHOU PELA LINHA
			(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
			(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
			(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // GANHOU PELA COLUNA
			(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
			(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
			(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || // GANHOU PELA DIAGONAL
			(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {
		System.out.println("Parabéns, Jogador 1 venceu a partida!");
		ganhou = true;

	  } else if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // GANHOU PELA LINHA
			(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
			(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
			(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // GANHOU PELA COLUNA
			(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
			(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
			(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // GANHOU PELA DIAGONAL
			(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {
		System.out.println("Parabéns, Jogador 1 venceu a partida!");
		ganhou = true;
	  } else if (jogada > 9) {
		System.out.println("EMPATE! A partida terminou.");
		ganhou = true;
	  }
	} while (!ganhou);
  }
}
