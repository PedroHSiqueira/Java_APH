package com.mycompany.vetores;

public class meses {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Sep", "Out", "Nov", "Dec"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int contador = 0; contador < mes.length; contador++) {
            System.out.println("O mes de " + mes[contador] + " tem " + tot[contador] + " Dias ");
        }
    }
}
