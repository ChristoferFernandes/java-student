package src.aula10;

public class Variaveis {
  public static void main(String[] args) {

	//Convenção Java
	int idade = 20;
	String nome = "Christofer";
	String nomeDoMeuCachorro = "Elizabeth";
	String ano2014 = "2014";

	//Nomes que posso fazer, mas não é utilizado
	int _idade;
	int $idade;

	//Não é convenção Java
	String nome_do_meu_cachorro;
	String NomeDoMeuCachorro;
	String nomeDoMeucachorro;

	//Atribuir novos valores as variáveis
	idade = 26;
	nome = "Gizele";

	System.out.println("Idade: " + idade);
	System.out.println("Nome: " + nome);
	System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);

	/*Má prática == Não declarar variáveis, sem um significado para que você ou outras pessoas, não consigam entender o seu código, exemplo:
	 */
	int a = 10;
	String b = "Loiane";
  }
}
