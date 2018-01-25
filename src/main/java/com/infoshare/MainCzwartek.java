package com.infoshare;

public class MainCzwartek {

    public static void main(String[] args) {
        // exercise1();
        // exercise2(8);
       // equalsTests();
        stringText();
    }


public static void stringText(){
        String s = "test:test::test";
        String[] arr = s.split(":");

}









    public static void exercise2(int x) {

        int[] table = new int[x];
        table[0] = 0;
        table[1] = 1;
        System.out.println(table[0]);


        for (int i = 1; i < x - 1; i++) {
            table[i + 1] = table[i] + table[i - 1];
            System.out.println(table[i] + " ");
        }

    }

    public static void equalsTests() {
/*
        Menu menu3 = new Menu();
        Menu menu4 = new Menu();
        System.out.println(menu3);
        System.out.println(menu4);
*/
        String hello = "czesc";

        String goodbye = new String("czesc");

        if (hello == goodbye) {
            System.out.println("to samo");
        } else {
            System.out.println("nie to samo!");
        }

        if (hello.equals(goodbye)) {
            System.out.println("to samo");
        } else {
            System.out.println("nie to samo!");
        }

        System.out.println(hello.hashCode());
        System.out.println(goodbye.hashCode());


    }


    public static void exercise1() {
        Menu menu1 = new Menu();
        menu1.setNumber(-99);
        menu1.check(false, 5);

        Menu menu2 = new Menu();
        menu2.setNumber(3);
        menu2.check(true, 3);


        System.out.println("menu1 number: " + menu1.getNumber());
        System.out.println("menu2 number: " + menu2.getNumber());


        menu1.check(true, 10);
        System.out.println("menu1 number: " + menu1.getNumber());
    }


}
