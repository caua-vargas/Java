import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade para saber sua categoria: ");
        int idade = ler.nextInt();
        if(idade>=5&&idade<=8){
            System.out.println(nome+" Infantil A");
        }
        else if(idade>=8&&idade<=10){
            System.out.println(nome+" Infantil B");
        }
        else if(idade>=11&&idade<=13){
            System.out.println(nome+" Juvenil A");
        }
        else if(idade>=14&&idade<=17){
            System.out.println(nome+" Juvenil B");
        }
        else if(idade>=18){
            System.out.println(nome+" Adulto");
        }
    }
}
