package com.home.work.model;

public class Truck extends Landtransport {
    private int loadCapacity;

    public Truck(int power, int top_speed, int mass, String brand, int countWheel, int fuelConsumption, int loadCapacity) {
        super(power, top_speed, mass, brand, countWheel, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck" + '\n' +
                "power = " + getPower() + " h.p., " +
                "top speed = " + getTop_speed() + " km/h, " +
                "mass = " + getMass() + " kg, " +
                "brand " + '\'' + getBrand() + '\'' +
                ", " + "count wheel = " + getCountWheel() +
                ", fuel consumption = " + getFuelConsumption() +
                " L/100 km, " +
                "load capacity = " + loadCapacity +
                ", power in kilowatts = " + getPowerInKilowatts() + " kW";
    }

    public void checkCargoLoad(int cargo) {
        if (cargo <= loadCapacity) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
