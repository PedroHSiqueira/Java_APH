package com.mycompany.operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //Realizar a media de 2 numeros
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.printf("A média é %.1f! \n",media);
        
        //Realizar multiplicação
        int n3 = 10;
        int n4 = 5;
        int respMult = n3 * n4;
        System.out.println("Resultado da multiplicação: " + respMult);
        
        //resto
        int n5 = 12;
        int n6 = 5;
        int resto = n5 % n6;
        System.out.println("Resto: " + resto);
    }
}
