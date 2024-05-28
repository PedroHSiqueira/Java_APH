package com.mycompany.condicionais;

import java.util.Scanner;

public class CondicionalSimples {

    public static void main(String[] args) {
        
        //Media condicional Simples
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Primeira Nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        System.out.println("Sua média foi " + media);
        
        if(media >= 9){
            System.out.println("Parabéns!");
        }
    }
}
