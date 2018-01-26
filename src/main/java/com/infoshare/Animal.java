package com.infoshare;

public class Animal {

    String name;


    public void eat(){

        System.out.println("OM NOM NOM OM");
    }

    public void sleep(){
        System.out.println("Zzzzz...");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
