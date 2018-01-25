package com.infoshare;

public class Pizza {

    double size;
    double price;

    public Pizza(double size, double price){
        this.size = size;
        this.price = price;

    }

    public double whatsBetter(){
        double field = Math.PI * Math.sqrt(size/2);

        double profitability = field / price;



        return profitability;
    }

}
