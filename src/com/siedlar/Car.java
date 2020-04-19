package com.siedlar;

public class Car {
    private String marka;
    private String model;
    private int km;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return marka+ " "+ model+" "+ km;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Car(String marka, String model, int km) {
        this.marka = marka;
        this.model = model;
        this.km = km;
    }
}
