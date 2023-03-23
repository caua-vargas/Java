
import java.util.Scanner;
public class gasolina {
    public static void main(String[]args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o km no inicio do dia: ");
        float kmInicial = ler.nextFloat();
        System.out.println("Digite o km no final do dia: ");
        float kmFinal = ler.nextFloat();
        float distancia = kmFinal-kmInicial;
        System.out.println("Quantos litros de combustive foram usados: ");
        float quantLitros = ler.nextFloat();
        System.out.println("Qualo valor recebido dos passageiros");
        float valorBruto = ler.nextFloat();
        float autonomia = distancia/quantLitros;
        float lucro = valorBruto-quantLitros*(float)5.40;
        System.out.println("Seu veiculo faz"+autonomia+"km/1 e seu lucro é de R$"+lucro);
    }
}
