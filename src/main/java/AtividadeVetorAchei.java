
import java.util.Random;
import java.util.Scanner;

public class AtividadeVetorAchei {
        public static void main(String[] args) {
            int[] vetor = new int[10];
            Random aleatorio = new Random();
            Scanner ler = new Scanner(System.in);
            int chances = 0;
            boolean achei = false;
            do{
            for (int i = 0; i < 10; i++) {
                vetor[i] = aleatorio.nextInt(20);
            }
            System.out.println("digite um valor para pesquisar no vetor: ");
            int valor = ler.nextInt();
            achei = false;
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i]==valor)
                    achei = true;
            }
            if(achei){
                System.out.println(valor+" existe na lista");
            }
            else{
                System.out.println(valor+" não existe nalista");
            }
            chances++;
            }
            while(chances != 3 &&  achei == false);
}
}
