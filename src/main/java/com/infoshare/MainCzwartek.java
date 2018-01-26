package com.infoshare;

import java.io.FileReader;
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
        //personExercise();
        // lotto();
        //equalsExercise();

        // stringBuilderExercise();
        //arrayExercise(10);
        //mapExercise();
        //exceptionsExercise();

        //extendsExercise();
        Friday friday = new Friday();
       // friday.exercise1();
        System.out.println("Czy powtarza się litera? - " + (friday.checkRepeatingChar("nr3gea")));

    }
    public void costam(){
        System.out.println("hi");
    }

    public static void extendsExercise(){

        Ant mrowczak = new Ant();
        Animal mrow = new Ant();
        Lion lion = new Lion();
        Animal lion2 = new Lion();
        lion.eat();
        mrowczak.sleep();
        mrow.eat();
        lion2.eat(); // lion2 can't rawr :(

        ((Lion) lion2).rawr(); // now he can

        System.out.println(lion.hashCode());
        System.out.println(mrowczak.hashCode());



    }

    public static void exceptionsExercise(){
        int[] table = new int[10];
        int rand;
        for (int i = 0; i<10; i++){
            rand = (int) (Math.random() * 100);
            table[i] = rand;
             }

        try {
            System.out.println(table[15]);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("zły index");
        }

        for (int a: table) {
            System.out.print(a + " ");
        }


    }


    public static void mapExercise() {

        Integer a = 1;
        Integer b = 2;
        Integer c = 1;
        Integer d = 4;

        String s1 = "kot";
        String s2 = "ptak";
        String s3 = "smok";
        String s4 = "smok";

        Map<Integer, String> stworzonka = new HashMap<Integer, String>();
        stworzonka.put(a, s1);
        stworzonka.put(b, s2);
        stworzonka.put(c, s3);
        stworzonka.put(d, s4);

        System.out.println(stworzonka.values());
        System.out.println(stworzonka.keySet());

        for (Map.Entry<Integer, String> e : stworzonka.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());

        }
    }


    public static void arrayExercise(int x) {

        int[] liczby = new int[x];
        int rand;
        for (int i = 0; i < x; i++) {
            rand = (int) (Math.random() * 100);
            liczby[i] = rand;

        }
        for (int o : liczby) {
            System.out.println(o);
        }

    }

    public static void stringBuilderExercise() {
        StringBuilder sb = new StringBuilder();
        sb.append("drzewo" + "#");
        sb.append("kwiatek" + "#");
        sb.append("plaża" + "#");
        sb.append("blok" + "#");
        sb.append("buty" + "#");
        sb.append("costam" + "#");
        sb.append("ksiazka" + "#");
        sb.append("rower");
        String slowa = sb.toString();
        System.out.println(slowa);
        String[] arrSlowa = slowa.split("#");
        int ileSlow = 0;
        for (String s : arrSlowa) {
            System.out.println(s);
            ileSlow++;
        }
        System.out.println(ileSlow);

    }


    public static void equalsExercise() {
        EqualsTest eqt1 = new EqualsTest(1, 25, "book", "item");
        EqualsTest eqt2 = new EqualsTest(1, 25, "book", "item");
        EqualsTest eqt3 = new EqualsTest(1, 25, "book", "item");
        EqualsTest eqt4 = new EqualsTest(2, 20, "pen", "item");
        /*
        EqualsTest eqt2 = new EqualsTest(2, 4, "pen","item");
        EqualsTest eqt3 = new EqualsTest(3, 502, "infoShare","school");
        EqualsTest eqt4 = new EqualsTest(3, 100, "falowiec","building");
        */
        System.out.println(eqt1 == eqt4);
        System.out.println(eqt1.equals(eqt4));

    }


    public static void lotto() {
        Lotto lotto1 = new Lotto();
        try {
            lotto1.nastepujeZwolnienieBlokady();
        } catch (InterruptedException e) {
            e.printStackTrace();
            }
    }

    public static void personExercise() {
        Person person1 = new Person("John", "Smith", "click");
        Person person2 = new Person("Zbigniew", "Brzęczyszczykiewicz", "Brzęczu");
        Person person3 = new Person("Anna", "Walik", "Val");
        Person person4 = new Person("James", "Bond", "007");
        Person person5 = new Person("Marie", "Ann", "Nix");
        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);


        Collections.sort(people);

        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void pizzaExercise() {
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
        MainMenu menu3 = new MainMenu();
        MainMenu menu4 = new MainMenu();
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
        MainMenu menu1 = new MainMenu();
        menu1.setNumber(-99);
        menu1.check(false, 5);

        MainMenu menu2 = new MainMenu();
        menu2.setNumber(3);
        menu2.check(true, 3);


        System.out.println("menu1 number: " + menu1.getNumber());
        System.out.println("menu2 number: " + menu2.getNumber());


        menu1.check(true, 10);
        System.out.println("menu1 number: " + menu1.getNumber());
    }

}
