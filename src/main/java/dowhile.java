import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner (System.in);
        do{
            System.out.println("Insire um número: ");
            numero = ler.nextInt();
        }while(numero<10);
    }
    
    
}
