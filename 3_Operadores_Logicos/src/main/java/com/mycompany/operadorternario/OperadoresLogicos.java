package com.mycompany.operadorternario;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        //Operador &&¨// Ambos devem ser verdadeiros
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        
        int r;
        r = (x < y && y < z) ? 1 : 0;
        
        System.out.println(r);
        
        //Operador || // um deve ser verdadeiro
        int p;
        p = (x > y || y < z) ? 1 : 0;
        
        System.out.println(p);
        
        //Operador ^ // SOMENTE UM deve ser verdadeiro
        int q;
        q = (x > y ^ y < z) ? 1 : 0;
        
        System.out.println(q);
    }
}
