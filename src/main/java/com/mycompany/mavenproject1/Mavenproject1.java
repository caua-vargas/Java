package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Informe a nota 1: ");
        float nota1 = ler.nextFloat();
        System.out.println("Informe a nota 2: ");
        float nota2 = ler.nextFloat();
        System.out.println("Informe a nota 3: ");
        float nota3 = ler.nextFloat();
        System.out.println("Informe a nota 4: ");
        float nota4 = ler.nextFloat();
        float media = nota1+nota2+nota3+nota4;
        media = media/4;
        System.out.println("Sua média é de: "+media);
        
    }
}
