package src.aula22.exercicios.ex04;

import java.util.Date;

public class Exercicio04 {
  public static void main(String[] args) {
	 LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
	 
	 livroBiblioteca.capa = "O novo rei de Kamelot";
	 livroBiblioteca.tituloLivro = "O rei Lancelot";
	 livroBiblioteca.autorLivro = "Daniel Hardman";
	 livroBiblioteca.qtdPaginas = 235;
	 livroBiblioteca.assuntoLivro = "Ficção, história sobre o antigo reino de Kamelot";
	 livroBiblioteca.anoPublicacao = 2001;
	 livroBiblioteca.sinopse = "O livro conta sobre o antigo reino de Kamelot, onde poderosos cavaleiros eram chamados para combater todo o mal.\n" +
			"Dentre eles, o cavaleiro com mais reconhecimento chamado Lancelot, se aproximou de seu rei Arthur, e de seu poderoso mago Merlin, e juntos\n" +
			"começaram uma nova jordada de unir todos os reinos da antiga Inglaterra. Jornada esta, que ocasionou a morte do rei Arthur, e lancelot foi coroado como o novo rei\n" +
			"Lancelot irá conseguir lidar com todos os problemas do reino, e ainda assim unir toda a Inglaterra? Venha se envolver nessa maravilhosa história de paixões, traições,\n" +
			"assassinatos, magia, e criaturas mágicas incríveis. Da qual o mundo moderno jamais pensou em existir.";
	 livroBiblioteca.emprestado = true;
	 livroBiblioteca.dataEntrega = new Date();
	 livroBiblioteca.emprestadoA = "Carlos Roberto";
	 
	 System.out.printf("Capa do livro: "+ livroBiblioteca.capa +"\n");
	 System.out.printf("Titulo do livro: "+ livroBiblioteca.tituloLivro +"\n");
	 System.out.printf("Quantidade de páginas: "+ livroBiblioteca.qtdPaginas +"\n");
	 System.out.printf("Assunto do livro: "+ livroBiblioteca.assuntoLivro +"\n");
	 System.out.printf("Ano de publicação: "+ livroBiblioteca.anoPublicacao +"\n");
	 System.out.printf("Sinopse: "+ livroBiblioteca.sinopse +"\n\n");
	 System.out.printf("Está emprestado: "+ livroBiblioteca.emprestado +"\n");
	 System.out.printf("Data do empréstimo: "+ livroBiblioteca.dataEntrega +"\n");
	 System.out.printf("Está emprestado para: "+ livroBiblioteca.emprestadoA +"\n");

  }
}
