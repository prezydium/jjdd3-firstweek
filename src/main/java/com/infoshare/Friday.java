package com.infoshare;

import java.util.Scanner;

public class Friday {

    public void exercise1() {
        String word;
        int ilosc = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst z kropkami");
        word = sc.next();
        int index = 0;
        while ((word.indexOf(".", index)) > -1) {
            index = word.indexOf(".", index) + 1;
            ilosc++;
        }
        System.out.println("W podanym tekście znajdowało się " + ilosc + " kropek");

    }

    /*
    public boolean checkRepeatingChar(String s) {
        boolean flag = false;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int x = 1;

        for (char a : chars) {
            for (int i = 0; (i < chars.length) && (x < chars.length) ; i++) {
                if (a == chars[x]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            } if (flag){
                break;
            }
            x++;
          }

        return flag;
       }
     */


    public boolean checkRepeatingChar(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int x = 1;

        for (char a : chars) {
            for (int i = 0; (i < chars.length) && (x < chars.length) ; i++) {
                if (a == chars[x]) {
                    return true;
                }
            }
            x++;
          }

        return false;
    }

    public void exercise4(){

        Developer dev1 = new Developer();
        dev1.setName("Krzysiek");
        dev1.showInfo();
    }

}
