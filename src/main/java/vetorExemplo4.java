
import java.util.Random;
import java.util.Scanner;


public class vetorExemplo4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Random aleatorio = new Random();
        
        System.out.println("numero aleatorio "+aleatorio.nextInt());
        System.out.println("Numero aleatorio de 0 a 10: "+aleatorio.nextInt(11));
        System.out.println("numero aleatorio entre -50 e 50: "+aleatorio.nextInt(-50, 50));
        System.out.println("boolean aleatorio: "+aleatorio.nextBoolean());
                
    }
}
