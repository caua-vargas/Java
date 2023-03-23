import java.util.Scanner;
public class ifelse {
  
    public static void main(String[] args) {    
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        if(numero==0){
           System.out.println("O número é zero"); 
        }
        else if (numero>0){
        System.out.println("O número "+numero+" é positivo");   
        }
        else{
            System.out.println("O número "+numero+" é negativo");
        }
}
}
