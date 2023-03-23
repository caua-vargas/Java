import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        float salarioPorHora = ler.nextFloat();
        System.out.println("Quantas horas você trabalha por mês?");
        float horasTrabalhadas = ler.nextFloat();
        float salario = salarioPorHora*horasTrabalhadas;
        System.out.println("Seu salário mensal é de R$"+salario);
    }
}
