package com.infoshare;

public class Menu {

   private int number;

   private String text;

    private int x;

    private Integer z;

    Cities city;


    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void staticMethod() {
        System.out.println("This is static method!");
    }

    public void nonStaticMethod() {
        System.out.println("This is non static method!");
    }


    public void showParams() {
        System.out.println("*" + number + " - " + text + "*");

    }

    public void checkText() {
        try {
            System.out.println(text.getClass());
        } catch (NullPointerException e) {
            System.out.println("No text!");
        }
    }

    public void setCityByNumber(){
        if (number == 1) {
            this.city = Cities.GDAŃSK;
        }
         else if (number == 2){
             this.city = Cities.SOPOT;
        }
        else {
            this.city = Cities.GDYNIA;
        }

    }

}
