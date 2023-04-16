package src.aula16;

public class While {
  public static void main(String[] args) {

	int count = 1;
	int max = 10;

	System.out.println("Contando até " + max);
	while (count <= max) {
	  System.out.println("Valor de count: " + count);
	  count++;
	}
	//Exemplo de loop infinito; POR ISSO É NECESSÁRIO SEMPRE REALIZAR O ICREMENTO.
        /*    int count = 1;
            int max = 10;
        while(count < 10){
            System.out.println(count);
        }*/
  }
}
