package src.aula11;

public class VariaveisChar
{
	public static void main(String[] args)
	{
		  //FORMA TRADICIONAL DE SE DECLARAR UM CHAR.
		  //char o = 'o';
		  //char i = 'i';
		  //FORMA DE DECLARAR UM CHAR UTILIZANDO NÚMEROS DA TABELA ASCII E TAMBÉM DO UNICODE, VALORES HEXADECIMAIS ENTRE OUTROS.
		  char o = 111;
		  char i = 105;
		  char interrogacao = 0x003F;
		  
		  System.out.println(o + i); // SE FIZER SEM AS "" PARA SEPARAR, VAI APENAS SOMAR O VALOR
		  System.out.println(""+ o + i); //COM ASPAS, VAI ENTENDER AS LETRAS DO CHAR.
		  System.out.println(""+ o + i + interrogacao); // COM INTERROGAÇÃO
	 }
}