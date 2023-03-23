import java.util.Scanner;
public class parouimpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número para saber se é par ou impar");
        int n = ler.nextInt();
        if(n%2==0){
            System.out.println("Numero par");
        }
        if(n%2==1){
            System.out.println("Numero impar");
        }
    }
}
