package com.home.work.model;

public class Transport {
    private int power;
    private int top_speed;
    private int mass;
    private String brand;

    public Transport(int power, int top_speed, int mass, String brand) {
        this.power = power;
        this.top_speed = top_speed;
        this.mass = mass;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPowerInKilowatts(){
        return getPower()*0.74;
    }
}
