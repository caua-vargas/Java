import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu peso em kg? ");
        float peso = ler.nextFloat();
        System.out.println("Informe sua altura em metros");
        float altura = ler.nextFloat();
        double imc = peso/Math.pow(altura,2);
        System.out.println("Seu imc é de: "+imc);
    }
}
