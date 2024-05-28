package com.mycompany.condicionais;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("A: ");
        int a = teclado.nextInt();
        
        System.out.print("B: ");
        int b = teclado.nextInt();
        
        System.out.print("C: ");
        int c = teclado.nextInt();
        
        if (a < b  + c && b < a + c && c < a + b){
            System.out.println("Formam um triangulo");
            
            if( a == b && c == c){
                System.out.println("Equilátero!");
            }else if(a != b && b != c && c != a) {
                System.out.println("Escaleno");
            }else{
                System.out.println("Isósceles");
            }
            
        }else {
            System.out.println("Não formam um triangulo ");
        }
    }
}
