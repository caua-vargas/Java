
import java.util.Scanner;
public class exemplo2 {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = ler.next();
        System.out.println("Bem vindo, "+nome+" "+sobrenome);
    }
}
