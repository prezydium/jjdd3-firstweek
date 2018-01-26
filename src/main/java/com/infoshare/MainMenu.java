package com.infoshare;

public class MainMenu extends AbstractMenu{

    Cities city;
    private int number;
    private String text;
    private int x;
    private Integer z;

    public static void staticMethod() {
        System.out.println("This is static method!");
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public void setCityByNumber() {
        switch (number) {
            case 1:
                this.city = Cities.GDAŃSK;
                break;
            case 2:
                this.city = Cities.SOPOT;
                break;
            case 3:
                this.city = Cities.GDYNIA;
        }

    }

    public void check(boolean ch, int value){
        if (ch){
            number = number + value;
        } else {
            number = number - value;
        }
    }


    @Override
    public void show() {

    }

    @Override
    public void close() {

    }

    @Override
    public void runOption(int option) {

    }
}

