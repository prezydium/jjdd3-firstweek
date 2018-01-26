package com.infoshare;

public abstract class User {
    String name;

    public void showInfo(){
        System.out.println(name + " - typ użytkownika: " + this.getClass());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
