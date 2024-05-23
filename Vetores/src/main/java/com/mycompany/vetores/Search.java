package com.mycompany.vetores;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {
        int numeros[] = {1, 3, 5, 7, 9, 11};

        //Colocar em ordem
        Arrays.sort(numeros);

        //Buscar o elemento desejado
        int pos = Arrays.binarySearch(numeros, 7);

        System.out.println(pos);
    }
}
