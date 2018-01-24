package com.infoshare;

public class Menu {

    int number;

    String text;

    Menu(){

    }


    Menu(int number, String text){

        this.number = number;
        this.text = text;
    }

    public static void staticMethod(){
        System.out.println("This is static method!");
    }

    public void nonStaticMethod(){
        System.out.println("This is non static method!");
    }


    public void showParams(){
            System.out.println("*" + number + " - " + text + "*");

    }

    public void checkText(){
        try {
            System.out.println(text.getClass());
        }   catch (NullPointerException e){
        System.out.println("No text!");
        }
    }
}
