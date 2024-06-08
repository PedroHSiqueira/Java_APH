/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author T-Gamer
 */
public class Cachorro extends Mamifero{
    
    //Polimorfismo de sobrecarga
    public void reagir(String frase){
        if(frase.equals("Olá")){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Latir");
        }
    };
    
    public void reagir(int hora){
        if(hora > 12){
            System.out.println("Au au!");
        }else{
            System.out.println("Latindo");
        }
    };
}
