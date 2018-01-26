package com.infoshare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Lotto {

    Scanner sc = new Scanner(System.in);

    int zakres, ilosc, wylosowana;


    public void nastepujeZwolnienieBlokady() throws InterruptedException {

        System.out.println("Podaj zakres losowania: ");
        zakres = sc.nextInt();
        System.out.println("Podaj ilość liczb do wylosowania: ");
        ilosc = sc.nextInt();
        List<Integer> trafione = new ArrayList<>();
        System.out.println("Następuje zwolnienie blokady i rozpoczynamy losowanie " + ilosc + " liczb");

        for(int i = 0; i < ilosc; i++){
            do {
                wylosowana = (int) ((Math.random() * zakres) + 1);
            } while (trafione.contains(wylosowana));
            trafione.add(wylosowana);
            sleep(1000);
            System.out.println(wylosowana);
        }

    }




}
