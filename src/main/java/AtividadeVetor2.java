
import java.util.Scanner;


public class AtividadeVetor2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contVet ;
        
        System.out.println("defina o tamanho do vetor (no maximo 10): ");
        contVet = ler.nextInt();
        
        int vetorA[] = new int [contVet];
        int vetorB[] = new int [contVet];
        int vetorSoma[] = new int [contVet];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("defina os valores para cada elemento do vetor A:");
            vetorA[i] = ler.nextInt();
            
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("defina os valores para cada elemento dovetor B:");
            vetorB[i] = ler.nextInt();
        }
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("defina os valores para cada elemento:");
            vetorSoma[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorA[i]+"+"+vetorB[i]+"="+vetorSoma[i]);
        
        }
    }
}
