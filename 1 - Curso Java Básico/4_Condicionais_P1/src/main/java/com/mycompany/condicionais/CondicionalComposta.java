package com.mycompany.condicionais;

import java.util.Scanner;


public class CondicionalComposta {
    
    public static void main(String[] args) {
        
      System.out.print("Em que ano você nasceu?: ");
      Scanner teclado = new Scanner(System.in);
      int nascimento = teclado.nextInt();
      
      int idade = 2024 - nascimento;
        System.out.println("Sua idade é: " + idade);
      
      if(idade >= 18){
          System.out.println("Maior");
      }else{
          System.out.println("Menor");
      }
    }
}
