/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author T-Gamer
 */
public class Professor {
    private float salario;
    private String expecialidade;
    
    public void receberAumento(){
        setSalario(getSalario() + 1000.0f);
    };

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getExpecialidade() {
        return expecialidade;
    }

    public void setExpecialidade(String expecialidade) {
        this.expecialidade = expecialidade;
    }
    
    
}
