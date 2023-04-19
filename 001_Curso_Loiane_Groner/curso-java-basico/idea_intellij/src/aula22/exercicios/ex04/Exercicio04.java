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
			
			System.out.println("Capa do livro: ");
			System.out.println(livroBiblioteca.capa);
			System.out.println("Titulo do livro: ");
			System.out.println(livroBiblioteca.tituloLivro);
			System.out.println("Autor do livro: ");
			System.out.println(livroBiblioteca.autorLivro);
			System.out.println("Quantidade de páginas: ");
			System.out.println(livroBiblioteca.qtdPaginas);
			System.out.println("Assunto do livro: ");
			System.out.println(livroBiblioteca.assuntoLivro);
			System.out.println("Ano de publicação: ");
			System.out.println(livroBiblioteca.anoPublicacao);
			System.out.println("Sinopse: ");
			System.out.println(livroBiblioteca.sinopse);
			System.out.println("Está emprestado: ");
			System.out.println((livroBiblioteca.emprestado = true));
			System.out.println("Data do empréstimo: ");
			System.out.println(livroBiblioteca.dataEntrega);
			System.out.println("Está emprestado para: ");
			System.out.println(livroBiblioteca.emprestadoA);
			
	 }
}
