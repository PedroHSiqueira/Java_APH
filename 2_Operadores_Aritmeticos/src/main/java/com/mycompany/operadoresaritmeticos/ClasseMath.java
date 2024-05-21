package com.mycompany.operadoresaritmeticos;

public class ClasseMath {
    public static void main(String[] args) {
        
        //Raiz Quadrada
        float raiz = (float) Math.sqrt(25); // Usando Typecast
        System.out.println("Raiz: " + raiz);
        
        //Exponenciação
        float exponenciacao = (float) Math.pow(5, 2);
        System.out.println("exponenciação: " + exponenciacao);
        
        // Raiz Cubica
        float cubica = (float) Math.cbrt(27);
        System.out.println("Raiz Cubica: " + cubica);
        
        //Abs
        int absoluto = Math.abs(-15);
        System.out.println("Absoluto: " + absoluto);
        
        // Arredondamentos
        
        //Baixo
        int baixo = (int) Math.floor(15.3);
        System.out.println("Arredondar para Baixo: " + baixo);
        
        
        int cima = (int) Math.ceil(15.3);
        System.out.println("Arredondar para cima: " + cima);
        
        
        int variavel = (int) Math.round(15.3);
        System.out.println("Arredondar para o mais proximo: " + variavel);
        
        //Randomico
        
        double aleatorio = Math.random();
        System.out.println("Numero aleatorio: " + aleatorio);
        
    }
}
