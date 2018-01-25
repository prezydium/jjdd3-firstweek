package com.infoshare;


import java.util.*;

public class Person implements Comparable<Person>{
    String name;
    String surname;
    String nick;

    public Person(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public int comparator(String surname){
        int compare = surname.compareTo(surname);
        return compare;
    };

    @Override
    public int compareTo(Person o) {
        int compare = surname.compareTo(o.surname);
        return compare;
    }

    @Override
    public String toString() {
        return (surname + " " + name + " \"" + nick + "\"");
    }

    /*
    public List<Person> sort(List<Person> list){
        Collections.sort(list, comparator(surname));

        return list;

    }*/
}
