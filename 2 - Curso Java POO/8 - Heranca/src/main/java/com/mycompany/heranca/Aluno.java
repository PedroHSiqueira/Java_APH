/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author T-Gamer
 */
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade de aluno");
    };
    
    public void cancelarMatricula(){};

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
