/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.relacionamento;

/**
 *
 * @author T-Gamer
 */
public class Relacionamento {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        l[0] = new Lutador("Pedro", "Brasileiro", 19, 1.79f, 79, 10, 3, 1);
        l[1] = new Lutador("Henrique", "Português", 32, 1.72f, 82, 5, 1, 4);
        l[2] = new Lutador("Yamada", "Japonês", 24, 1.81f, 71, 9, 4, 1);
        l[3] = new Lutador("Thiery", "Francês", 27, 1.74f, 81, 4, 3, 0);
        l[4] = new Lutador("Karl", "Norte-Americano", 22, 1.65f, 72, 6, 3, 4);
        l[5] = new Lutador("Josh", "Canadense", 29, 1.78f, 86, 6, 4, 3);
    }
}
