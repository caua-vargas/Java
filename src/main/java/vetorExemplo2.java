
import java.util.Scanner;


public class vetorExemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[100];
        int cont=0;
        int resp;
        do{
            System.out.println("entre com um valor para posição vetor["+cont+"]");
            vetor[cont] = ler.nextInt();
            cont++;
            System.out.println("Ler mais numeros 1 - sim 2 - não");
            resp = ler.nextInt();
        }
        while (resp==1 && cont<100);
        System.out.println("dados no vetor...");
        for(int i=0 ; i<cont ; i++){
            System.out.println(vetor[i]+" ");
        }
    }
}
