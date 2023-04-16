package src.aula22.exercicios.ex05;

public class Exercicio05 {
  public static void main(String[] args) {
	ContaCorrente conta = new ContaCorrente();
	conta.numeroConta = "15";
	conta.agencia = "13";
	conta.especial = true;
	conta.limiteEspecial = 500.50;
	conta.saldo = 1500.35;

	System.out.println("Número da conta: " + conta.numeroConta);
	System.out.println("Agência: " + conta.agencia);
	System.out.println("Conta especial ?" + conta.especial);
	System.out.println("Limite do cheque Especial: R$" + conta.limiteEspecial);
	System.out.println("Saldo: R$" + conta.saldo);
  }
}
