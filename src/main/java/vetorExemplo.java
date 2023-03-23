
import java.util.Scanner;

public class vetorExemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int [10];
        int vetorA[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("entre com um valor  para posição vetor ["+i+"]");
            vetor [i] = ler.nextInt();
        }
        System.out.println("dador do vetor...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+" ");
            
        }
        System.out.println("\nDados no vetor for simplificado...");
        for(int valor : vetor)
            System.out.println(valor+" ");
}
    
}
