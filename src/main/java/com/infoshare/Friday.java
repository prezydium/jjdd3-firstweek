package com.infoshare;

import java.util.Scanner;

public class Friday {

    public void exercise1(){
        String word;
        int ilosc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst z kropkami");
        word = sc.next();
        int index = 0;
        while((word.indexOf(".", index)) > -1){
            index = word.indexOf(".", index) + 1;
            ilosc++;
        }
        System.out.println("W podanym tekście znajdowało się " + ilosc + " kropek");

    }
}
