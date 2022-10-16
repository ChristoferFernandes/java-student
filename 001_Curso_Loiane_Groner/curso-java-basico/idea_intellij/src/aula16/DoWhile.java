package src.aula16;

public class DoWhile {
    public static void main(String[] args) {

        int count = 0;
        int max = 10;

        do{
            count++;
            System.out.println(count);
        } while (count < 15);
        System.out.println("valor de count: "+ count);
    }
}
