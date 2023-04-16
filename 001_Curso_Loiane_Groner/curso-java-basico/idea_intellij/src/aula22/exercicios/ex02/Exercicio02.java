package src.aula22.exercicios.ex02;

public class Exercicio02 {
  public static void main(String[] args) {
	Livro livro = new Livro();

	livro.capa = "O novo rei de Kamelot";
	livro.tituloLivro = "O rei Lancelot";
	livro.autorLivro = "Daniel Hardman";
	livro.qtdPaginas = 235;
	livro.assuntoLivro = "Ficção, história sobre o antigo reino de Kamelot";
	livro.anoPublicacao = 2001;
	livro.sinopse = "O livro conta sobre o antigo reino de Kamelot, onde poderosos cavaleiros eram chamados para combater todo o mal.\n" +
		  "Dentre eles, o cavaleiro com mais reconhecimento chamado Lancelot, se aproximou de seu rei Arthur, e de seu poderoso mago Merlin, e juntos\n" +
		  "começaram uma nova jordada de unir todos os reinos da antiga Inglaterra. Jornada esta, que ocasionou a morte do rei Arthur, e lancelot foi coroado como o novo rei\n" +
		  "Lancelot irá conseguir lidar com todos os problemas do reino, e ainda assim unir toda a Inglaterra? Venha se envolver nessa maravilhosa história de paixões, traições,\n" +
		  "assassinatos, magia, e criaturas mágicas incríveis. Da qual o mundo moderno jamais pensou em existir.";

	System.out.println("Capa do livro: ");
	System.out.println(livro.capa);
	System.out.println("Titulo do livro: ");
	System.out.println(livro.tituloLivro);
	System.out.println("Autor do livro: ");
	System.out.println(livro.autorLivro);
	System.out.println("Quantidade de páginas: ");
	System.out.println(livro.qtdPaginas);
	System.out.println("Assunto do livro: ");
	System.out.println(livro.assuntoLivro);
	System.out.println("Ano de publicação: ");
	System.out.println(livro.anoPublicacao);
	System.out.println("Sinopse: ");
	System.out.println(livro.sinopse);

  }
}
