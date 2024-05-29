package com.mycompany.modificadores;

public class Modificadores {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", 0.7f, "Amarela", true);

//        c1.setModelo("Bic");
//        // c1.modelo = "Bic"; ERROR
//        
//        c1.setPonta(0.5f);
//        // c1.ponta = 0.5f; ERROR

        c1.status();
    }
}
