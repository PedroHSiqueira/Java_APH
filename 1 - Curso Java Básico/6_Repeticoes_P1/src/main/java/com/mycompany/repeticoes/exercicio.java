package com.mycompany.repeticoes;

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Numero a ser Fatorado: ");
        int numero = teclado.nextInt();
        int fatorial = 1;
        int contador = numero;

        while (contador >= 1) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
