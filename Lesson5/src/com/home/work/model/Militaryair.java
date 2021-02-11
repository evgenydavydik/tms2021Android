package com.home.work.model;

public class Militaryair extends Airtransport {
    private boolean isEjectionSystem;
    private int countMissiles;

    public Militaryair(int power, int top_speed, int mass, String brand, int wingspan, int minLengthRunway, boolean isEjectionSystem, int countMissiles) {
        super(power, top_speed, mass, brand, wingspan, minLengthRunway);
        this.isEjectionSystem = isEjectionSystem;
        this.countMissiles = countMissiles;
    }

    @Override
    public String toString() {
        return "Militaryair" +
                "power = " + getPower() + " h.p., " +
                "top speed = " + getTop_speed() + " km/h, " +
                "mass = " + getMass() + " kg, " +
                "brand " + '\'' + getBrand() + '\'' +
                " wingspan" + getWingspan() + " m, " +
                "Minimum runway length for take-off " + getMinLengthRunway() + " m, " +
                " ejection system = " + isEjectionSystem +
                ", count missiles = " + countMissiles +
                ", power in kilowatts = " + getPowerInKilowatts() + " kW";
    }

    public void shot() {
        if (countMissiles != 0) {
            System.out.println("The rocket went ...");
            countMissiles--;
        } else {
            System.out.println("No ammunition!");
        }
    }

    public void ejection(){
        if(isEjectionSystem){
            System.out.println("The ejection was successful");
        } else {
            System.out.println("You don't have such a system");
        }
    }

    public boolean isEjectionSystem() {
        return isEjectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        isEjectionSystem = ejectionSystem;
    }

    public int getCountMissiles() {
        return countMissiles;
    }

    public void setCountMissiles(int countMissiles) {
        this.countMissiles = countMissiles;
    }
}
