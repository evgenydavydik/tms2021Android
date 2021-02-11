package com.home.work.model;

public class Landtransport extends Transport{
    private int countWheel;
    private int fuelConsumption;

    public Landtransport(int power, int top_speed, int mass, String brand, int countWheel, int fuelConsumption) {
        super(power, top_speed, mass, brand);
        this.countWheel = countWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(int countWheel) {
        this.countWheel = countWheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
