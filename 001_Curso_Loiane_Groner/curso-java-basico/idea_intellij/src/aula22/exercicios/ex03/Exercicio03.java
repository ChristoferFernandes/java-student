package src.aula22.exercicios.ex03;

public class Exercicio03 {
	 public static void main(String[] args) {
			LivroLivraria livroLivraria = new LivroLivraria();
			livroLivraria.capa = "O novo rei de Kamelot";
			livroLivraria.tituloLivro = "O rei Lancelot";
			livroLivraria.autorLivro = "Daniel Hardman";
			livroLivraria.qtdPaginas = 235;
			livroLivraria.assuntoLivro = "Ficção, história sobre o antigo reino de Kamelot";
			livroLivraria.anoPublicacao = 2001;
			livroLivraria.sinopse = "O livro conta sobre o antigo reino de Kamelot, onde poderosos cavaleiros eram chamados para combater todo o mal.\n" +
					 "Dentre eles, o cavaleiro com mais reconhecimento chamado Lancelot, se aproximou de seu rei Arthur, e de seu poderoso mago Merlin, e juntos\n" +
					 "começaram uma nova jordada de unir todos os reinos da antiga Inglaterra. Jornada esta, que ocasionou a morte do rei Arthur, e lancelot foi coroado como o novo rei\n" +
					 "Lancelot irá conseguir lidar com todos os problemas do reino, e ainda assim unir toda a Inglaterra? Venha se envolver nessa maravilhosa história de paixões, traições,\n" +
					 "assassinatos, magia, e criaturas mágicas incríveis. Da qual o mundo moderno jamais pensou em existir.";
			livroLivraria.preco = 42.80;
			
			System.out.println("Capa do livro: ");
			System.out.println(livroLivraria.capa);
			System.out.println("Titulo do livro: ");
			System.out.println(livroLivraria.tituloLivro);
			System.out.println("Autor do livro: ");
			System.out.println(livroLivraria.autorLivro);
			System.out.println("Quantidade de páginas: ");
			System.out.println(livroLivraria.qtdPaginas);
			System.out.println("Assunto do livro: ");
			System.out.println(livroLivraria.assuntoLivro);
			System.out.println("Ano de publicação: ");
			System.out.println(livroLivraria.anoPublicacao);
			System.out.println("Sinopse: ");
			System.out.println(livroLivraria.sinopse);
			System.out.println("Preço do livro: ");
			System.out.printf("R$ %.2f", livroLivraria.preco);
			
	 }
}
