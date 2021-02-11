package com.home.work.model;

public class Airtransport extends Transport{
    private int wingspan;
    private int minLengthRunway;

    public Airtransport(int power, int top_speed, int mass, String brand, int wingspan, int minLengthRunway) {
        super(power, top_speed, mass, brand);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    public void setMinLengthRunway(int minLengthRunway) {
        this.minLengthRunway = minLengthRunway;
    }
}
