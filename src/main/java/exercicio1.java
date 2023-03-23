import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do mês que deseja: ");
        String mes = ler.next();
        switch(mes){
        case "janeiro" -> System.out.println("mês 1");
        case "fevereiro" -> System.out.println("mês 2");
        case "jmarco" -> System.out.println("mês 3");
        case "jabril" -> System.out.println("mês 4");
        case "maio" -> System.out.println("mês 5");
        case "junho" -> System.out.println("mês 6");
        case "julho" -> System.out.println("mês 7");
        case "agosto" -> System.out.println("mês 8");
        case "setembro" -> System.out.println("mês 9");
        case "outubro" -> System.out.println("mês 10");
        case "novembro" -> System.out.println("mês 11");
        case "dezembro" -> System.out.println("mês 12");    
         
    }
    }
    
}
