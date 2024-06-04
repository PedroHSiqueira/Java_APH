/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author T-Gamer
 */
public class Exercicio {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 20, "M");
        p[1] = new Pessoa("Maria", 24, "F");    
        
        l[0] = new Livro("Java", "Jose", 300, p[0]);
        l[1] = new Livro("Python", "Carlos", 500, p[1]);
        l[2] = new Livro("Ruby", "Ana", 800, p[0]);
        
        
        l[0].abrir();
        l[0].folear(20);
        System.out.println(l[0].detalhes());
    }
}
