package com.mycompany.operadoresaritmeticos;

public class OperadoresUnarios {
    
    public static void main(String[] args) {
        
       //Incremento
        int n1 = 5;
        n1++;
        System.out.println("Incremento: " + n1);
        
        //Decremento 
        n1--;
        System.out.println("Decremento: " + n1);
        
        //Operadores de atribuição
        
        //soma
        int n2 = 10;
        n2 += 5;
        System.out.println("Atribuição (+): " + n2);
        
        //Subtração
        n2 -= 5;
        System.out.println("Atribuição (-): " + n2);
        
        //Multiplicação
        n2 *= 2;
        System.out.println("Atribuição (*): " + n2);
        
        //Divisão
        n2 /= 2;
        System.out.println("Atribuição (/): " + n2);
        
        //Resto
        n2 %= 2;
        System.out.println("Atribuição (%): " + n2);
    }
}
