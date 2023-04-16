package src.aula25.exercicios.ex02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaCorrente {
  Scanner key = new Scanner(System.in);
  DecimalFormat nf = new DecimalFormat("###,###.##");
  int numeroConta;
  double saldo;
  boolean contaEspecial;
  double limite;
  double saldoEspecial;
  byte opcao;
  double saque;
  String usandoLimiteEspecial;
  double deposito;

  void mostrarStatus() {
	numeroConta = 15;
	saldo = 1500;
	limite = 2500;
	saldoEspecial = 750;

	System.out.println("---- STATUS DA CONTA ----");
	System.out.println();
	System.out.println("Número da conta: " + numeroConta);
	System.out.println("Saldo da conta: R$ " + nf.format(saldo));
	System.out.println("Limite máximo da conta: R$" + nf.format(limite));
  }

  void fazerSaques() {
	System.out.print("Quanto você deseja sacar? R$");
	saque = key.nextDouble();

	if (saque <= saldo) {
	  saldo -= saque;
	  System.out.println("Contando notas...");
	  System.out.println("Saque de R$" + nf.format(saque) + " realizado com sucesso.");

	} else {
	  System.out.println("Saldo insuficiente");
	  System.out.print("Temos um limite especial disponível de R$" + nf.format(saldoEspecial) + " para saque, deseja utilizar? ");
	  usandoLimiteEspecial = key.next();
	  if (usandoLimiteEspecial.equalsIgnoreCase("sim")) {
		contaEspecial = true;
		System.out.print("Quanto você deseja sacar do limite especial? R$");
		saque = key.nextDouble();

		if (saque <= saldoEspecial) {
		  saldoEspecial -= saque;
		  saldo -= saque;
		  System.out.println("Contando notas...");
		  System.out.println("Saque de R$" + nf.format(saque) + " realizado com sucesso.");
		} else {
		  System.out.println("Saldo insuficiente.");
		}
	  } else {
		System.out.println("Saldo indisponível.");
	  }
	}
  }

  void fazerDepositos() {
	System.out.print("Quanto deseja depositar? R$");
	deposito = key.nextDouble();

	if (saldo >= 0 && deposito + saldo <= limite) {
	  saldo += deposito;
	  System.out.println("Depósito de R$" + nf.format(deposito) + " realizado com sucesso.");


	} else if (saldo < 0 && saldoEspecial <= 750) {
	  System.out.println("Deposito de R$" + nf.format(deposito) + " realizado com sucesso.");
	  System.out.println("Desconto da utilização do limite especial, realizada com sucesso.");
	  saldoEspecial += deposito;
	  saldo += deposito;

	} else {
	  System.out.println("Erro de depósito, o depósito não pode exceder o limite máximo da conta.");
	}
  }

  void mostrarSaldo() {
	System.out.println("Saldo disponível: R$" + nf.format(saldo));
	System.out.println("É uma conta especial? " + contaEspecial);

	if (contaEspecial) {
	  System.out.println("Saldo do limite especial: R$" + nf.format(saldoEspecial));
	}
  }

  void utilizarFuncoes() {
	switch (opcao) {
	  case 0:
		System.out.println("Obrigado por utilizar nosso caixa, volte sempre =)");
		break;
	  case 1:
		fazerSaques();
		break;
	  case 2:
		fazerDepositos();
		break;
	  case 3:
		mostrarSaldo();
		break;
	  default:
	}
  }
}
