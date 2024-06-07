/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author T-Gamer
 */
public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltar uma bolha");
    }
;

}
