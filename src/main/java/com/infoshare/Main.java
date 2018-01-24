package com.infoshare;

public class Main {


    public static void main(String[] args) {
       // System.out.println("infoShareAcademy - Java SE");

        Menu menu1 = new Menu();
        menu1.setNumber(1);
        Menu menu2 = new Menu();
        menu2.setNumber(2);
        menu1.setCityByNumber();
        menu2.setCityByNumber();
    /**  menu1.setText("Oliwa");

        //menu1.showParams();
        //menu1.checkText();

        System.out.println(menu1.getNumber()+" " + menu1.getText());
        System.out.println("\u0109");


        System.out.println(menu1.getX());

        System.out.println(menu1.getZ());

        menu1.setCity(Cities.GDAŃSK);

        System.out.println(menu1.getCity());

        int liczbaA = 10;
        int liczbaB = 3;

         double wynikDouble1 = (double) liczbaA / liczbaB;

        System.out.println(wynikDouble1);


        double liczbaC = (double) liczbaA;
        double liczbaD = (double) liczbaB;

        double wynikDouble = liczbaC / liczbaD;

        System.out.println(wynikDouble);

        int i = 3;

        System.out.println(i++);
        System.out.println(++i); **/

        System.out.println(menu1.getCity());
        System.out.println(menu2.getCity());




    }
}


