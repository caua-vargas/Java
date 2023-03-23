import java.util.Scanner;
public class switc {
    public static void main(String[] args) {
          Scanner ler = new Scanner (System.in);
          System.out.println("Digite o número de um dia da seman");
          int dia = ler.nextInt();
//          switch(dia){
//              case 1: System.out.println("é Domingo"); break;
//              case 2: System.out.println("é Segunda"); break;
//              case 3: System.out.println("é Terça"); break;
//              case 4: System.out.println("é Quarta"); break;
//              case 5: System.out.println("é Quinta"); break;
//              case 6: System.out.println("é Sexta"); break;
//              case 7: System.out.println("é Sábado"); break;
//              default: System.out.println("Este não é um dia da semana");break;
//          }
               switch(dia){
             case 1 -> System.out.println("é Domingo"); 
             case 2 -> System.out.println("é Segunda"); 
             case 3 -> System.out.println("é Terça"); 
             case 4 -> System.out.println("é Quarta"); 
             case 5 -> System.out.println("é Quinta"); 
             case 6 -> System.out.println("é Sexta"); 
             case 7 -> System.out.println("é Sábado"); 
             default -> System.out.println("Este não é um dia da semana");
               }
    }
}
