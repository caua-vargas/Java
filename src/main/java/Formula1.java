import java.util.Scanner;
public class Formula1 {
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
        System.out.println("qual o comprimento da pista em metros: ");
        float comprimento = ler.nextFloat();
        System.out.println("quantas voltas são percorridas: ");
        int voltas = ler.nextInt();
        System.out.println("quantas voltas quer reabastecer: ");
        float reabastecer = ler.nextFloat();
        System.out.println("qual o consumo de combustivel do carro em km/L: ");
        float consumo = ler.nextFloat();
        float comprimentoTotalKm = (comprimento*voltas)/1000;
        float primReabastecimento = comprimentoTotalKm/consumo/reabastecer;
        System.out.println("o primeiro reabastecimento ocorrerá após"+primReabastecimento+"Km");
        
    }
    
}
