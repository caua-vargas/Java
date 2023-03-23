
import java.util.Scanner;


public class vetorExemplo3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[] vetor = {1,2,5,8,10};
        String[] lista = {"ana", "joao silva", "silvia"};
        
        for(String nome:lista){
            System.out.println(nome+" ");
        }
    }
    
}
