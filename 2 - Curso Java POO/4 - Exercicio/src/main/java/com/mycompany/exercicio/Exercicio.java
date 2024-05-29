package com.mycompany.exercicio;

public class Exercicio {

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setDono("Pedro");
        p1.setNumConta(1111);
        p1.abrirConta("CC");
        
        Conta p2 = new Conta();
        p2.setDono("Henrique");
        p2.setNumConta(2222);
        p2.abrirConta("CP");
        
        p1.depositar(5000.0f);
        p2.depositar(2000.0f);
    }
}
