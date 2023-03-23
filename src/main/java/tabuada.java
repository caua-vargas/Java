import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = ler.nextInt();
        int multiplicador=0;
        while(multiplicador <10){
            multiplicador++;
            System.out.println(multiplicador+"x"+numero+"="+multiplicador*numero);
        }
    }
}
