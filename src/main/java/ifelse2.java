
import java.util.Scanner;

public class ifelse2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma senha: ");
        String senha = ler.next();
        if (senha.equals("123456")) {
            System.out.println("senha correta");
        } else {
            System.out.println("Senha incorreta");
        }
    }

}
