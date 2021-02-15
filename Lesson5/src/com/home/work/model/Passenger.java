package com.home.work.model;

public class Passenger extends Landtransport {
    private String typeOfBody;
    private int countPassengers;

    public Passenger(int power, int top_speed, int mass, String brand, int countWheel, int fuelConsumption, String typeOfBody, int countPassengers) {
        super(power, top_speed, mass, brand, countWheel, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.countPassengers = countPassengers;
    }

    @Override
    public String toString() {
        return "Passenger transport " + '\n' +
                "power = " + getPower() + " h.p., " +
                "top speed = " + getTop_speed() + " km/h, " +
                "mass = " + getMass() + " kg, " +
                "brand " + '\'' + getBrand() + '\'' +
                ", " + "count wheel = " + getCountWheel() +
                ", fuel consumption = " + getFuelConsumption() +
                " L/100 km, " +
                "type of body " + '\'' + typeOfBody + "', " +
                "count passengers = " + countPassengers +
                ", power in kilowatts = " + getPowerInKilowatts() + " kW";
    }

    public void infoMaxKmAndLitersFuel(double time) {
        System.out.println("For the time " + time + " h, car '" + getBrand() +
                "' driving at maximum speed " + getTop_speed() + " km/h will travel " +
                way(time) + " km and use " +
                fuelСonsumption(way(time)) + " liters of fuel");
    }

    private double fuelСonsumption(double way) {
        return way / 100 * getFuelConsumption();
    }

    private double way(double time){
        return time*getTop_speed();
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }
}
