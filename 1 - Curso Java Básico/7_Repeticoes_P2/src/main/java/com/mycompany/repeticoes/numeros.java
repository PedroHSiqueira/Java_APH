package com.mycompany.repeticoes;

import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        int numero;
        int soma = 0;
        String resp;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Quer continuar ? (S / N): ");
            resp = teclado.next().toUpperCase();

        } while (resp.equals("S"));

        System.out.println("Soma de todos os valores é : " + soma);
    }
}
