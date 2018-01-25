package com.infoshare;

import java.util.*;

import static java.lang.Thread.sleep;

public class MainCzwartek {

    public static void main(String[] args) {
        // exercise1();
        // exercise2(8);
        // equalsTests();
        // stringText();
        //createArray(8);
        //setsExercises();
        //binary();
        //pizzaExercise();

       // Przedzialy exercise = new Przedzialy();
       // exercise.przedzialy();
        personExercise();
    }

    public static void personExercise(){
        Person person1 = new Person("John", "Smith", "click");
        Person person2 = new Person("Zbigniew", "Brzęczyszczykiewicz", "Brzęczu");
        Person person3 = new Person("Anna", "Walik", "Val");
        Person person4 = new Person("James", "Bond", "007");
        Person person5 = new Person("Marie", "Ann", "Nix");
        List<Person> people= new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);


        Collections.sort(people);

        for (Person p: people) {
            System.out.println(p);
        }
    }

public static void pizzaExercise(){
     Pizza pizzaMala = new Pizza(32, 19);
    Pizza pizzaDuza = new Pizza(65, 45.9);

    System.out.println("Opłacalność małej: " + pizzaMala.whatsBetter());
    System.out.println("Opłacalność dużej: " + pizzaDuza.whatsBetter());
      System.out.println("Mniejsza wartość = lepiej!");

}







    public static void binary() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String wynik = MainCzwartek.getBinary(a);
        System.out.println(wynik);


    }

    public static String getBinary(int a) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        while (a != 0) {
            if ((a % 2) != 0) {
                sb.append("1");
                a = a / 2;
            } else {
                sb.append("0");
                a = a / 2;
            }

        }
        sb = sb.reverse();
        result = sb.toString();
        return result;
    }


    public static void setsExercises() {

        String a = "Piastowska";
        String b = "Jagiellońska";
        String c = "Jagiellońska";
        String d = "Obrońców Wybrzeża";
        String e = "Kołobrzeska";

        List<String> ulice = new ArrayList<String>();
        ulice.add(a);
        ulice.add(b);
        ulice.add(c);
        ulice.add(d);
        ulice.add(e);

        for (String nazwa : ulice) {
            System.out.println(nazwa);
            System.out.println(nazwa.hashCode());
            try {
                sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }


    public static void createArray(int x) {
        int[] table = new int[10];
        table[0] = x;
        for (int i = 1; i < table.length; i++) {
            table[i] = table[i - 1] + 1;
        }

        for (int e : table) {
            System.out.println(e + " ");
        }
    }


    public static void stringText() {
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


   /* public static void exercise1() {
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
*/

}
