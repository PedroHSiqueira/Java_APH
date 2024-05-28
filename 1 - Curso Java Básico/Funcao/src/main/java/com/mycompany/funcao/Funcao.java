package com.mycompany.funcao;

public class Funcao {

    static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("A soma é : " + soma);
    }

    public static void main(String[] args) {
        soma(5, 2);
        System.out.println("Vai começar a contagem");
        System.out.println(Operacoes.contador(1, 5));
    }
}
