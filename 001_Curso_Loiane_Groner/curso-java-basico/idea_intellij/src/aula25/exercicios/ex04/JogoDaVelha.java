package src.aula25.exercicios.ex04;

import java.util.Scanner;

public class JogoDaVelha {
	 char[][] jogoDaVelha = new char[3][3];
	 int jogada = 1;
	 
	 boolean validarJogada(int linha, int coluna, char jogou) {
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == jogou) {
				 return false;
			} else {
				 jogoDaVelha[linha][coluna] = jogou;
				 jogada++;
				 return true;
			}
	 }
	 
	 void criarTabuleiro() {
			for (int i = 0; i < jogoDaVelha.length; i++) {
				 for (int j = 0; j < jogoDaVelha[i].length; j++) {
						System.out.print(jogoDaVelha[i][j] + " | ");
				 }
				 System.out.println();
			}
	 }
	 
	 boolean verificarVencedor(char jogou) {
			if ((jogoDaVelha[0][0] == jogou && jogoDaVelha[0][1] == jogou && jogoDaVelha[0][2] == jogou) || // GANHOU PELA LINHA
					 (jogoDaVelha[1][0] == jogou && jogoDaVelha[1][1] == jogou && jogoDaVelha[1][2] == jogou) ||
					 (jogoDaVelha[2][0] == jogou && jogoDaVelha[2][1] == jogou && jogoDaVelha[2][2] == jogou) ||
					 (jogoDaVelha[0][0] == jogou && jogoDaVelha[1][0] == jogou && jogoDaVelha[2][0] == jogou) || // GANHOU PELA COLUNA
					 (jogoDaVelha[0][1] == jogou && jogoDaVelha[1][1] == jogou && jogoDaVelha[2][1] == jogou) ||
					 (jogoDaVelha[0][2] == jogou && jogoDaVelha[1][2] == jogou && jogoDaVelha[2][2] == jogou) ||
					 (jogoDaVelha[0][0] == jogou && jogoDaVelha[1][1] == jogou && jogoDaVelha[2][2] == jogou) || // GANHOU PELA DIAGONAL
					 (jogoDaVelha[0][2] == jogou && jogoDaVelha[1][1] == jogou && jogoDaVelha[2][0] == jogou)) {
				 return true;
			}
			return false;
	 }
}

