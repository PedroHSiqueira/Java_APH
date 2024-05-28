package com.mycompany.condicionais;

import java.util.Scanner;

public class encadeamento {

    public static void main(String[] args) {
        //Condicional de idade
        Scanner teclado = new Scanner(System.in);

        System.out.print("Data de Nascimento: ");
        int nascimento = teclado.nextInt();

        int idade = 2024 - nascimento;

        if (idade < 16) {
            System.out.println("Voto não Obrigatorio");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto Opcional");
        } else {
            System.out.println("Voto Obrigatorio");
        }
    }
}
