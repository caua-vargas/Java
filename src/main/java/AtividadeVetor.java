
import java.util.Random;
import java.util.Scanner;


public class AtividadeVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Random aleatorio = new Random();
        int[] vetor = new int[100];
        int[] vetor2 = new int[100];
        
        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = aleatorio.nextInt(200);
            
        }
        System.out.println("dados do primeiro vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]+"");
            
        }
        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i]*2;
       
        }
        System.out.println("dados do segundo vetor");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]+"");
            
        }
    }
}
