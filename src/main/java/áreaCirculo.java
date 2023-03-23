import java.util.Scanner;
public class áreaCirculo {
    public static void main(String[] args) {
        System.out.println("Informe o raio do circulo: ");
        Scanner ler = new Scanner(System.in);
        float raio = ler.nextFloat();
        double area = Math.PI*Math.pow(raio,2);
        
        System.out.println("A área do seu circulo é de: "+area);
        
    }
}
