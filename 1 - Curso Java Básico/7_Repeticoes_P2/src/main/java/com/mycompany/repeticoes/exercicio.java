package com.mycompany.repeticoes;

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valores = 0;
        int pares = 0;
        int impares = 0;
        int maiorCem = 0;
        int numero;
        int total = 0;
        int media;

        do {
            System.out.print("Digite um valor: ");
            numero = teclado.nextInt();

            //Verificações
            valores++;

            //Soma
            total += numero;

            //Par ou impar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            //Maior que cem
            if (numero > 100) {
                maiorCem++;
            }

        } while (numero != 0);

        //Media
        media = total / valores;
        
        System.out.println("Total de valores: " + valores);
        System.out.println("Total de pares: " + pares);
        System.out.println("Tota de impares: " + impares);
        System.out.println("Maior que cem: " + maiorCem);
        System.out.println("Media dos valores: " + media);
    }
}
