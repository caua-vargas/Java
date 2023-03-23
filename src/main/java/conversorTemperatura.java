import java.util.Scanner;
public class conversorTemperatura {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.println("Informe uma temperatura em graus fahrenheit: ");
       float temperaturaF = ler.nextFloat();
       float temperaturaC = 5*(temperaturaF-32)/9;
       System.out.println("A temperatura em celsius é de: "+temperaturaC);
    }
}
