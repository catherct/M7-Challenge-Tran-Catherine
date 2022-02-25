package com.company;

public class App {

    public PointOfSales createPOS() {
        PointOfSales pos = new PointOfSales("mint chocolate chip",
                3, 2, 7.95, true);
        return pos;
    }

    public Factory createFactory() {
        Factory factory = new Factory("cookie monster",6, 0, true);
        return factory;
    }
}
