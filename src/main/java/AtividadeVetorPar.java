
import java.util.Random;
public class AtividadeVetorPar {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int [20];
        
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] =aleatorio.nextInt(6); 
            System.out.println(numeros[i]+"");
        }
        int[] par = new int [20];
        int[] impar = new int [20];
        int cp = 0;
        int ci = 0;
        
        for (int i = 0; i <numeros.length; i++) {
            if(numeros[i]%2==0){
                par[cp++] = numeros[i];
            }
            else{
                impar[ci++] = numeros[i];
            }  
            }
        System.out.println("\nsão pares:");
            for (int i = 0; i < cp; i++) {
                System.out.println(par[i]+" ");
        }
            System.out.println("\nsão impares:");
            for (int i = 0; i < ci; i++) {
                System.out.println(impar[i]+" ");
    }
    
}
}
