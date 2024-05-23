package com.mycompany.vetores;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        
        Arrays.fill(numeros, 0);
        
        for(int valor: numeros){
            System.out.print(valor);
        }
    }
}
