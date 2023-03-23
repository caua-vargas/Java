
import java.util.Scanner;


public class AtividadeVetorWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int vetor[] =  new int[100];
        int cont=0;
        int num;
        do {
            System.out.println("Digite um numero na posição["+cont+"]: ");
            num = ler.nextInt();
            if(num>0){
                vetor[cont] = num;
                cont++;
            }
        }
        while(num!=0 && cont<100);
        
        System.out.println("dados no vetor...");
        for(int i:vetor){
            System.out.println(i+"");
        }
    }
}
