package com.mycompany.repeticoes;

public class Repeticoes {

    public static void main(String[] args) {

        int cc = 0;
        while (cc < 10) {
            cc++;

            if (cc == 5 || cc == 7) {
                continue;
            } else if (cc == 10) {
                break;
            }
            
            System.out.println("Cambalhota " + cc);
        }
    }
}
