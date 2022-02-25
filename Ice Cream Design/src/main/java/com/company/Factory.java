package com.company;

public class Factory {

    //properties
    private String flavor;
    private int tubNumber;
    private int tempSet;      //degrees Fahrenheit
    private boolean shipmentReady;


    //constructor
    public Factory (String flavorIn, int tubsIn, int tempIn,
                    boolean shipOut) {
        this.flavor = flavorIn;
        this.tubNumber = tubsIn;
        this.tempSet = tempIn;
        this.shipmentReady = shipOut;
    }



    //behaviors

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getTubNumber() {
        return tubNumber;
    }

    public void setTubNumber(int tubNumber) {
        this.tubNumber = tubNumber;
    }

    public int getTempSet() {
        return tempSet;
    }

    public void setTempSet(int tempSet) {
        this.tempSet = tempSet;
    }

    public boolean isShipmentReady() {
        return shipmentReady;
    }

    public void setShipmentReady(boolean shipmentReady) {
        this.shipmentReady = shipmentReady;
    }
}
