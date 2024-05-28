package com.mycompany.condicionais;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        //Uso de Switch
        System.out.print("Numero de Pernas: ");
        Scanner teclado = new Scanner(System.in);

        int pernas = teclado.nextInt();
        String tipo;

        switch (pernas) {
            case 1:
                tipo = "Sacy";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6 , 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println("Tipo: " + tipo);
    }
}
