
import java.util.Scanner;
import java.util.Random;


public class AtividadeVetorInverso {
    public static void main(String[] args) {
       Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int [10];
        int[] rotev = new int [10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(15);
            System.out.println("os numeros do vetor são: "+vetor[i]);
        }
        for (int j = 0, t = 9; j < vetor.length; j++, t--) {
            rotev[j] = vetor[t];
            System.out.println("os numeros do vetor inverso são: "+rotev[j]);
        }
    }
    
}
