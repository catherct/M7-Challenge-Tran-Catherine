package com.company;

public class PointOfSales {

    //properties
    private String flavor;
    private int scoopNumber;
    private int toppings;
    private double price;
    private boolean waffleCone;


    //constructor
    public PointOfSales (String flavorIn, int scoopsIn, int toppingsIn,
                         double priceIn, boolean coneIn) {
        this.flavor = flavorIn;
        this.scoopNumber = scoopsIn;
        this.toppings = toppingsIn;
        this.price = priceIn;
        this.waffleCone = coneIn;
    }


    //behaviors

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getScoopNumber() {
        return scoopNumber;
    }

    public void setScoopNumber(int scoopNumber) {
        this.scoopNumber = scoopNumber;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaffleCone() {
        return waffleCone;
    }

    public void setWaffleCone(boolean waffleCone) {
        this.waffleCone = waffleCone;
    }
}
