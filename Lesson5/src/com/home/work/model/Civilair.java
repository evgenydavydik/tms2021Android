package com.home.work.model;

public class Civilair extends Airtransport {
    private int countPassengers;
    private boolean isBusinessClass;

    public Civilair(int power, int top_speed, int mass, String brand, int wingspan, int minLengthRunway, int countPassengers, boolean isBusinessClass) {
        super(power, top_speed, mass, brand, wingspan, minLengthRunway);
        this.countPassengers = countPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    @Override
    public String toString() {
        return "Civilair" + '\n' +
                "power = " + getPower() + " h.p., " +
                "top speed = " + getTop_speed() + " km/h, " +
                "mass = " + getMass() + " kg, " +
                "brand " + '\'' + getBrand() + '\'' +
                " wingspan" + getWingspan() + " m, " +
                "minimum runway length for take-off " + getMinLengthRunway() + " m, " +
                "count passengers = " + countPassengers +
                ", Business class = " + isBusinessClass +
                ", power in kilowatts = " + getPowerInKilowatts() + " kW";
    }

    public void checkCapacity(int countPassengers) {
        if (countPassengers <= this.countPassengers) {
            System.out.println("Passengers are placed on the plane");
        } else {
            System.out.println("You need a bigger plane");
        }
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }
}
