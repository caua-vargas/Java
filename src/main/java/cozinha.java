import java.util.Scanner;
public class cozinha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o comprimento da sua cozinha: ");
        float comprimento = ler.nextFloat();
        System.out.println("Informe o largura da sua cozinha: ");
        float largura = ler.nextFloat();
        System.out.println("Informe o altura da sua cozinha em metros: ");
        float altura = ler.nextFloat();
        float tamanhoEmMetroQuadrado = ((largura+comprimento)*altura)*2;
        System.out.println("Informe a área ocupada por aberturas ");
        float aberturas = ler.nextFloat();
        
        double caixasComprar = (tamanhoEmMetroQuadrado-aberturas)/(float) 1.5;
        System.out.println("Você deverá comprar: "+caixasComprar+"caixas");
    }
}
