package com.mycompany.condicionais;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Valores
        
        System.out.println("Valores");
        System.out.print("A: ");
        int a = teclado.nextInt();
        
        System.out.print("B: ");
        int b = teclado.nextInt();
        
        System.out.print("C: ");
        int c = teclado.nextInt();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        System.out.println("delta é : " + delta);
        
        if(delta < 0){
            System.out.println("Não existe raiz real");
        }else{
            System.out.println("Possui raiz Real ");
        }
    }
}
